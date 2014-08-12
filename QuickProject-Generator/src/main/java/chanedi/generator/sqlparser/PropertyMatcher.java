package chanedi.generator.sqlparser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * Created by jijy on 2014/7/31.
 */
public final class PropertyMatcher {

    private static final Logger logger = LoggerFactory.getLogger(PropertyMatcher.class);

    private static List<Properties> propertieses;

    static {
        File dir = new File(PropertyMatcher.class.getResource("/typeMatch").getFile());
        File[] files = dir.listFiles();
        for (File file : files) {
            Properties properties = new Properties();
            try {
                properties.load(new FileInputStream(file));
                propertieses.add(properties);
            } catch (IOException e) {
                logger.error(e.getLocalizedMessage(), e);
            }
        }
    }



}
