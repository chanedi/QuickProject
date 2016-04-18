package chanedi.generator;

import chanedi.util.StringUtils;

import java.io.*;

/**
 * Created by jijingyu625 on 2016/4/18.
 */
public class CodeGenerator {

    public static void generateSetter(String filePath) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));

        String line = null;
        do {
            line = fileReader.readLine();
            if (!line.contains(";")) {
                continue;
            }

            String[] splits = line.split(";")[0].split(" ");
            String attrName = splits[splits.length - 1];
            System.out.println("set" + StringUtils.capitalize(attrName));
        } while (line != null);
    }
}
