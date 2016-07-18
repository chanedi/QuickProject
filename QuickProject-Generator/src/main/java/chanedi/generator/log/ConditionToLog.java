package chanedi.generator.log;

import java.util.HashMap;

/**
 * Created by jijingyu625 on 2016/5/2.
 */
class ConditionToLog extends HashMap {

    public ConditionToLog(String condition, String methodName) {
        put("methodName", methodName);
        put("condition", condition);
    }

}
