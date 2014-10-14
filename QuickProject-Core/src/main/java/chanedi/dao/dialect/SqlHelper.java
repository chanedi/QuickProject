package chanedi.dao.dialect;

/**
 * Created by Chanedi
 */
public class SqlHelper {

    /**
     * 将SQL语句变成一条语句，并且每个单词的间隔都是1个空格。
     *
     * @param sql
     *            SQL语句。
     * @return 如果sql是NULL返回空，否则返回转化后的SQL。
     */
    public static String getLineSql(String sql) {
        return sql.replaceAll("[\r\n]", " ").replaceAll("\\s{2,}", " ");
    }

}
