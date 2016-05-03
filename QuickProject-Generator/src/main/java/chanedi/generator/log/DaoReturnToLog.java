package chanedi.generator.log;

import java.util.HashMap;

/**
 * Created by jijingyu625 on 2016/5/2.
 */
class DaoReturnToLog extends HashMap {

    public DaoReturnToLog(String variableType, String variable, String methodName) {
        if (variableType.contains("List")) {
            put("isList", true);
        } else {
            put("isList", false);
        }
        put("methodName", methodName);
        put("variable", variable);
    }

}
