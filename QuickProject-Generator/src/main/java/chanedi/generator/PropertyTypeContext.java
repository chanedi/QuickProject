package chanedi.generator;

import chanedi.enums.DBDialectType;
import chanedi.generator.exception.ConfigException;
import chanedi.generator.model.PropertyType;
import chanedi.util.PropertiesWithOrder;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.annotation.concurrent.NotThreadSafe;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 单例。
 * @author Chanedi
 */
@NotThreadSafe
public final class PropertyTypeContext {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private static PropertyTypeContext instance;

    private static final String DB_CONVERT_FILE_NAME = "dbToJava_";
    private static final String TYPE_DEF_FILE_NAME = "typeDefinition";
    private static final String CONFIG_FILE_SUFFIX = ".properties";
    private String typeMatchConfigPath = "classpath:/typeMatch/";
    private Map<String, PropertyType> propertyTypes = new HashMap<String, PropertyType>(); // key 为 javaType
    private PropertiesWithOrder dbConvertProp = new PropertiesWithOrder();

    private ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();

    private PropertyTypeContext() throws ConfigException {
        super();
        GlobalConfig globalConfig = GlobalConfig.getInstance();

        DBDialectType dialect = globalConfig.getDbDialectType();
        loadProperties(dbConvertProp, DB_CONVERT_FILE_NAME + dialect + CONFIG_FILE_SUFFIX);
        Properties typeDefProp = new Properties();
        loadProperties(typeDefProp, TYPE_DEF_FILE_NAME + CONFIG_FILE_SUFFIX);

        // 构造所有propertyTypes
        for (Object javaType : dbConvertProp.values()) {
            String javaTypeStr = (String) javaType;
            if (propertyTypes.get(javaTypeStr) != null) {
                // 允许重复
                continue;
            }
            PropertyType propertyType = new PropertyType(javaTypeStr);
            propertyTypes.put(javaTypeStr, propertyType);
        }

        // 加载更多类型定义(允许不定义)
        // 以String作为默认值
        String defaultTypeJsonStr = (String) typeDefProp.get("String");
        if (defaultTypeJsonStr == null) {
            throw new ConfigException("typeDefinition.properties文件配置错误：必须定义String");
        }
        JSONObject defaultTypeJson = JSON.parseObject(defaultTypeJsonStr);
        // 遍历类型定义
        for (Map.Entry<String, PropertyType> propertyTypeEntry : propertyTypes.entrySet()) {
            String javaType = propertyTypeEntry.getKey();
            PropertyType propertyType = propertyTypeEntry.getValue();

            String typeJsonStr = (String) typeDefProp.get(javaType);
            JSONObject typeJson = null;
            if (typeJsonStr == null) { // 使用默认值
                typeJson = defaultTypeJson;
            } else {
                typeJson = JSON.parseObject(typeJsonStr);
            }

            for (Map.Entry<String, Object> defaultEntry : defaultTypeJson.entrySet()) {
                String typeKey = defaultEntry.getKey();
                String value = (String) typeJson.get(typeKey);
                if (value == null) { // 使用默认值
                    propertyType.addType(typeKey, (String) defaultEntry.getValue());
                } else {
                    propertyType.addType(typeKey, value);
                }
            }

        }
    }

    private void loadProperties(Properties properties, String propFileName) {
        GlobalConfig globalConfig = GlobalConfig.getInstance();
        String typeMatchConfigPath = globalConfig.getTypeMatchConfigPath() + "/";
        File dbConvertFile = null;
        try {
            dbConvertFile = resourceLoader.getResource(typeMatchConfigPath + propFileName).getFile();
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage(), e);
            try {
                dbConvertFile = resourceLoader.getResource(this.typeMatchConfigPath + propFileName).getFile();
            } catch (IOException e1) {
                throw new RuntimeException(e1);
            }
        }
        try {
            properties.load(new FileInputStream(dbConvertFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static PropertyTypeContext getInstance() {
        if (instance == null) {
            try {
                instance = new PropertyTypeContext();
            } catch (ConfigException e) {
                throw new RuntimeException(e);
            }
        }
        return instance;
    }

    public PropertyType matchPropertyType(String dbType) {
        dbType = dbType.toUpperCase();
        String javaType = "String";
        if (dbType == null) {
            javaType = "String";
        } else {
            List<Object> keys = dbConvertProp.keysInOrder();
            for (Object key : keys) {
                if (dbType.trim().matches(key.toString())) {
                    javaType = (String) dbConvertProp.get(key);
                }
            }
        }

        return propertyTypes.get(javaType);
    }

}