package chanedi.test;

import chanedi.dao.UserDAO;
import chanedi.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Chanedi
 */
public class DaoTest extends BaseTest {

    @Resource
    private UserDAO userDAO;
    @Resource
    private DataSource dataSource;

    @Before
    public void setUp() throws SQLException {
        Connection conn = DataSourceUtils.getConnection(dataSource);
        Statement statement = conn.createStatement();
        statement.execute("DROP TABLE USER IF EXISTS;");
        statement.execute("CREATE TABLE USER(ID VARCHAR2(50) NOT NULL, NAME VARCHAR2(50), CONSTRAINT PK_USER PRIMARY KEY(ID));");
        User user = new User();
        user.setId("test");
        user.setName("test");
        userDAO.insert(user);
        user.setId("test1");
        user.setName("test");
        userDAO.insert(user);
    }

    @Test
    public void testGetAll() {
        userDAO.getAll();
    }

    @Test
    public void testGet() {
        User params = new User();
        params.setName("test");
        logger.info(userDAO.get(params, 0, 1).toString());
        logger.info(userDAO.get(params, 0, 2).toString());
    }

}
