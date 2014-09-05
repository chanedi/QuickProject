package chanedi.test;

import chanedi.dao.UserDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * Created by Chanedi on 14-3-13.
 */
public class DaoTest extends BaseTest {

    @Resource
    private UserDAO userDAO;

    @Test
    public void test() {
        userDAO.getAll();
    }
}
