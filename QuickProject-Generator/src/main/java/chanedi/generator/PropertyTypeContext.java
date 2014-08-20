package chanedi.generator;

import chanedi.generator.model.Property;
import chanedi.generator.model.PropertyType;
import chanedi.util.PropertiesWithOrder;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by jijy on 2014/7/31.
 */
public final class PropertyTypeContext {

    private static final Logger logger = LoggerFactory.getLogger(PropertyTypeContext.class);

    private static final String CONFIG_PATH = "/typeMatch/";
    private static final String DB_CONVERT_FILE_NAME = "dbToJava_";// TODO 支持用户覆盖部分值
    private static final String TYPE_DEF_FILE_NAME = "typeDefinition";// TODO 支持用户覆盖部分值
    private static final String CONFIG_FILE_SUFFIX = ".properties";
    private static String dialect = "oracle"; // TODO 传入
    private static Map<String, PropertyType> propertyTypes = new HashMap<String, PropertyType>(); // key 为 javaType
    private static PropertiesWithOrder dbConvertProp = new PropertiesWithOrder();

    static {
        File dbConvertFile = new File(PropertyTypeContext.class.getResource(CONFIG_PATH + DB_CONVERT_FILE_NAME + dialect + CONFIG_FILE_SUFFIX).getFile());
        try {
            dbConvertProp.load(new FileInputStream(dbConvertFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File typeDefFile = new File(PropertyTypeContext.class.getResource(CONFIG_PATH + TYPE_DEF_FILE_NAME + CONFIG_FILE_SUFFIX).getFile());
        Properties typeDefProp = new Properties();
        try {
            dbConvertProp.load(new FileInputStream(typeDefFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Map.Entry<Object, Object> propEntry : typeDefProp.entrySet()) {
            String javaType = (String) propEntry.getKey();
            PropertyType propertyType = new PropertyType(javaType);

            String typeJsonStr = (String) propEntry.getValue();
            JSONObject jsonObject = JSON.parseObject(typeJsonStr);
            for (Map.Entry<String, Object> jsonEntry : jsonObject.entrySet()) {
                propertyType.addType(jsonEntry.getKey(), (String) jsonEntry.getValue());
            }

            propertyTypes.put(javaType, propertyType);
        }
    }

    public static PropertyType matchPropertyType(String dbType) {
        List<Object> keys = dbConvertProp.keysInOrder();
        for (Object key : keys) {
            if (key.toString().matches(dbType.trim())) {
                String javaType = (String) dbConvertProp.get(key);
                return propertyTypes.get(javaType);
            }
        }
        return null;
    }

}
