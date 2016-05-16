package chanedi.generator;

import org.junit.Test;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * Created by jijingyu625 on 2016/4/18.
 */
public class CodeGeneratorTest {

    private ResourceLoader resourceLoader = new PathMatchingResourcePatternResolver();

    @Test
    public void generateSetter() throws Exception {
        CodeGenerator.generateSetter(resourceLoader.getResource("classpath:/source/setterSource").getFile(), "BusJobToBatchDTO");
    }

    @Test
    public void generateDAOGetMethod() throws Exception {
        CodeGenerator.generateDaoGetMethod(false, "com.xx.xx.dto.", "XXX_XXX", "XXX", "Status status, int limit");
    }
}