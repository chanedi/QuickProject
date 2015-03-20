package chanedi.dao.impl.mybatis.typeHandler;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by chanedi on 2015/1/5.
 */
public class JSONObjectTypeHandler extends JSONTypeHandler<JSONObject> {

    public JSONObjectTypeHandler(Class<JSONObject> type) {
        super(type);
    }

    @Override
    protected JSONObject parseJSONString(String jsonString) {
        return JSONObject.parseObject(jsonString);
    }

}
