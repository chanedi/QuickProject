package chanedi.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * net.sf.json.JSONArray工具类。
 * 
 * @author Chanedi
 */
public class JSONUtils {

	private static String KEY_NAME = "value";
	private static String VALUE_NAME = "text";

	/**
	 * 不允许创建实例。
	 */
	private JSONUtils() {}

	/**
	 * 将枚举类转换为JSONArray。
	 *
	 * @param enumClass
	 * @return JSONArray
	 */
	public static JSONArray enumToJSONArray(Class<? extends Enum<?>> enumClass) {
		return enumToJSONArray(enumClass, null, null);
	}

	/**
	 * 将枚举类转换为JSONArray。
	 * 
	 * @param enumClass
	 * @param keyName
	 * @param valueName
	 * @return JSONArray
	 */
	public static JSONArray enumToJSONArray(Class<? extends Enum<?>> enumClass, String keyName,
											String valueName) {
		if (StringUtils.isEmpty(keyName)) {
			keyName = KEY_NAME;
		}
		if (StringUtils.isEmpty(valueName)) {
			valueName = VALUE_NAME;
		}

		JSONArray jsonArray = new JSONArray();
		Enum<?>[] constants = enumClass.getEnumConstants();
		for (Enum<?> constant : constants) {
			JSONObject o = new JSONObject();
			o.put(keyName, constant.name());
			o.put(valueName, constant.toString());
			jsonArray.add(o);
		}

		return jsonArray;
	}

	/**
	 * 将map转换为JSONArray。
	 * 
	 * @param map
	 * @return JSONArray
	 */
	@SuppressWarnings("rawtypes")
	public static JSONArray mapToJSON(Map map) {
		return mapToJSON(map, KEY_NAME, VALUE_NAME);
	}

	/**
	 * 将map转换为JSONArray。
	 * 
	 * @param map
	 * @return JSONArray
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static JSONArray mapToJSON(Map map, String keyName, String valueName) {
		if (StringUtils.isEmpty(keyName)) {
			keyName = KEY_NAME;
		}
		if (StringUtils.isEmpty(valueName)) {
			valueName = VALUE_NAME;
		}

		JSONArray jsonArray = new JSONArray();
		Set<Entry> entrySet = map.entrySet();
		for (Entry entry : entrySet) {
			JSONObject o = new JSONObject();
			o.put(keyName, entry.getKey());
			o.put(valueName, entry.getValue());
			jsonArray.add(o);
		}
		return jsonArray;
	}

}
