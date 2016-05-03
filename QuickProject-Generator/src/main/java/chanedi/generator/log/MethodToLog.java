package chanedi.generator.log;

import java.util.HashMap;

/**
 * Created by jijingyu625 on 2016/5/2.
 */
class MethodToLog extends HashMap {

    private String methodName;

    public MethodToLog(String returnType, String methodName, String argStr) {
        if (returnType.contains("List")) {
            put("isList", true);
        } else {
            put("isList", false);
        }
        put("methodName", methodName);
        String[] argNames = argStr.split(",");
        for (int i = 0; i < argNames.length; i++) {
            String[] arg = argNames[i].split(" ");
            argNames[i] = arg[arg.length - 1];
        }
        put("argNames", argNames);
    }

    public void setReturnValue(String returnValue) {
        put("returnValue", returnValue);
    }

    public String getMethodName() {
        return (String) get("methodName");
    }
}
