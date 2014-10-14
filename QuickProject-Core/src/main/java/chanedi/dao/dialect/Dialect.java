package chanedi.dao.dialect;

import chanedi.dao.complexQuery.Sort;

import java.util.List;

/**
 * 数据库方言。
 * Created by unknown
 * Modify by Chanedi
 */
public abstract class Dialect {

    public abstract String addLimitString(String sql, int skipResults, int maxResults);

    public abstract String addSortString(String sql, List<Sort> sortList);

}