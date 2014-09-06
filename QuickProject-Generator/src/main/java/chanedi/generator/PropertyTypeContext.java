package chanedi.generator;

import chanedi.enums.DBDialectType;
import chanedi.generator.model.Property;
import chanedi.generator.model.PropertyType;
import chanedi.util.PropertiesWithOrder;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.mobicents.commons.annotations.NotThreadSafe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * 单例。
 * Created by Chanedi
 */
@NotThreadSafe
public final class PropertyTypeContext {

    private static PropertyTypeContext instance;

    private static final String DB_CONVERT_FILE_NAME = "dbToJava_";// TODO 支持用户覆盖部分值
    private static final String TYPE_DEF_FILE_NAME = "typeDefinition";// TODO 支持用户覆盖部分值
    private static final String CONFIG_FILE_SUFFIX = ".properties";
    private Map<String, PropertyType> propertyTypes = new HashMap<String, PropertyType>(); // key 为 javaType
    private PropertiesWithOrder dbConvertProp = new PropertiesWithOrder();

    private ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();

    private PropertyTypeContext() {
        super();
        GlobalConfig globalConfig = GlobalConfig.getInstance();
        String typeMatchConfigPath = globalConfig.getTypeMatchConfigPath();
        DBDialectType dialect = globalConfig.getDbDialectType();
        File dbConvertFile = new File(PropertyTypeContext.class.getResource(typeMatchConfigPath + DB_CONVERT_FILE_NAME + dialect + CONFIG_FILE_SUFFIX).getFile());
        try {
            dbConvertProp.load(new FileInputStream(dbConvertFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File typeDefFile = new File(PropertyTypeContext.class.getResource(typeMatchConfigPath + TYPE_DEF_FILE_NAME + CONFIG_FILE_SUFFIX).getFile());
        Properties typeDefProp = new Properties();
        try {
            typeDefProp.load(new FileInputStream(typeDefFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
        for (Map.Entry<Object, Object> defEntry : typeDefProp.entrySet()) {
            String javaType = (String) defEntry.getKey();
            PropertyType propertyType = propertyTypes.get(javaType);

            String typeJsonStr = (String) defEntry.getValue();
            JSONObject jsonObject = JSON.parseObject(typeJsonStr);
            for (Map.Entry<String, Object> jsonEntry : jsonObject.entrySet()) {
                propertyType.addType(jsonEntry.getKey(), (String) jsonEntry.getValue());
            }
        }
    }

    public static PropertyTypeContext getInstance() {
        if (instance == null) {
            instance = new PropertyTypeContext();
        }
        return instance;
    }

    public PropertyType matchPropertyType(String dbType) {
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