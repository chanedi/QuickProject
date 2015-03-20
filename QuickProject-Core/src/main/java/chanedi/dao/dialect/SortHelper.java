package chanedi.dao.dialect;

import chanedi.dao.complexQuery.Sort;

import java.util.List;

/**
 * @author Chanedi
 */
public class SortHelper {

    public static String addSortString(String querySelect, List<Sort> sortList) {
        if (sortList == null || sortList.size() == 0) {
            return querySelect;
        }
        querySelect = SqlHelper.getLineSql(querySelect);
        if (querySelect.toUpperCase().matches(".+ORDER +BY.+")) {
            // 已存在排序
            return querySelect;
        }
        StringBuilder sb = new StringBuilder(querySelect);
        sb.append(" ORDER BY ");
        for (Sort sort : sortList) {
            if (sort.getColumn() == null) {
                continue;
            }
            if (sort.getTableAlias() != null) {
                sb.append(sort.getTableAlias() + ".");
            }
            sb.append(sort.getColumn());
            sb.append(" ");
            sb.append(sort.getDirection());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

}
