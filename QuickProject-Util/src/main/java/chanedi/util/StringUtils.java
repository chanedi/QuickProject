package chanedi.util;

/**
 * @author Chanedi
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {

    public static String capitalizeCamelBySeparator(String str, String separatorChars) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String[] splits = str.toLowerCase().split(separatorChars);
        StringBuffer result = new StringBuffer();
        for (String split : splits) {
            result.append(capitalize(split));
        }
        return result.toString();
    }

    public static String uncapitalizeCamelBySeparator(String str, String separatorChars) {
        return uncapitalize(capitalizeCamelBySeparator(str, separatorChars));
    }

}
