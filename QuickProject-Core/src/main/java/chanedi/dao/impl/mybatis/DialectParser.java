package chanedi.dao.impl.mybatis;

import chanedi.dao.dialect.Dialect;
import chanedi.dao.dialect.H2Dialect;
import chanedi.dao.dialect.MySql5Dialect;
import chanedi.dao.dialect.OracleDialect;
import chanedi.enums.DBDialectType;
import org.apache.ibatis.session.Configuration;

/**
 * @author Chanedi
 */
public class DialectParser {

    public static Dialect parse(Configuration configuration) {
        DBDialectType databaseType = null;
        try {
            databaseType = DBDialectType.valueOf(configuration.getVariables().getProperty("dialect").toUpperCase());
        } catch (Exception e) {
            // ignore
        }
        if (databaseType == null) {
            throw new RuntimeException("the value of the dialect property in configuration.xml is not defined : " + configuration.getVariables().getProperty("dialect"));
        }
        Dialect dialect = null;
        switch (databaseType) {
            case MYSQL:
                dialect = new MySql5Dialect();
                break;
            case ORACLE:
                dialect = new OracleDialect();
                break;
            case H2:
                dialect = new H2Dialect();
                break;
        }
        return dialect;
    }

}
