package chanedi.dao.dialect;

import chanedi.dao.complexQuery.Sort;

import java.util.List;

/**
 * @author Chanedi
 */
public class H2Dialect extends Dialect {

	@Override
	public String addLimitString(String sql, int offset, int limit) {
		return MySql5PageHepler.addLimitString(sql, offset, limit);
	}

    @Override
    public String addSortString(String sql, List<Sort> sortList) {
        return SortHelper.addSortString(sql, sortList);
    }

}