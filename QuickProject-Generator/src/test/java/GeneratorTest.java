import chanedi.generator.FilesGenerator;
import chanedi.generator.exception.ConfigException;
import chanedi.generator.model.Bean;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import junit.framework.TestCase;
import org.junit.Test;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jijy on 2014/7/24.
 */
public class GeneratorTest extends TestCase {

    @Test
    public void testGenerator() throws ConfigException {
        FilesGenerator generator = new FilesGenerator();
        generator.process();
    }

}
