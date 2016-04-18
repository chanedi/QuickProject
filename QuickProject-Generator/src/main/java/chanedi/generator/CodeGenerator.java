package chanedi.generator;

import chanedi.util.StringUtils;

import java.io.*;

/**
 * Created by jijingyu625 on 2016/4/18.
 */
public class CodeGenerator {

    public static void generateSetter(File file) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        while (true) {
            String line = fileReader.readLine();
            if (line == null) {
                break;
            }
            if (!line.contains(";")) {
                continue;
            }

            String[] splits = line.split(";")[0].split(" ");
            String attrName = splits[splits.length - 1];
            System.out.println("set" + StringUtils.capitalize(attrName) + "(\"\");");
        }
    }
}
