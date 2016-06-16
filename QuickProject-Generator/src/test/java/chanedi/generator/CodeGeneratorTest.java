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
        CodeGenerator.generateSetter(resourceLoader.getResource("classpath:/source/setterSource").getFile(), "XXXDTO");
    }

    @Test
    public void generateDAOGetMethod() throws Exception {
        CodeGenerator.generateDaoGetMethod(false, "BUS_XX", "com.xx.dto.XXDTO", "String userId, String test");
    }
}