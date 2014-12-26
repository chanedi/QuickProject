package chanedi.action.view;

import java.util.List;

/**
 * Created by chanedi on 2014/12/22.
 */
public interface TableView {

    /**
     * 设置查询当前分页的数据，list中每个元素应为一行数据。
     * @param rows
     */
    public void setRows(List<?> rows);

    /**
     * 设置查询结果总数。
     * @param total
     */
    public void setTotal(int total);

}
