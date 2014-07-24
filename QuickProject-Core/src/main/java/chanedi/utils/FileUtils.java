package chanedi.utils;

import java.io.File;

/**
 * Created by jijy on 2014/7/24.
 */
public class FileUtils {

    public static String getFileExtension(File file) {
        return getFileExtension(file.getName());
    }

    public static String getFileExtension(String fileName) {
        String[] splits = fileName.split("\\.");
        return splits[splits.length - 1];
    }

    public static String removeFileExtension(String fileName) {
        int indexOfFileExtension = fileName.lastIndexOf('.');
        return fileName.substring(0, indexOfFileExtension);
    }

}
