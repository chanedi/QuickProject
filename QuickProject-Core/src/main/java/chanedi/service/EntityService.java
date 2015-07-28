package chanedi.service;

import chanedi.dao.complexQuery.CustomQueryParam;
import chanedi.dao.complexQuery.Sort;
import chanedi.model.Entity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Chanedi
 */
//@Transactional(rollbackFor = { Exception.class }, readOnly = true)
public interface EntityService<T extends Entity> {

    public List<T> getAll();

    public T getById(Object id);

    public int countGet(T findParams);

    public List<T> get(T findParams);

    public List<T> get(T findParams, List<Sort> sortList, Integer start, Integer limit);

    public int countFind(T findParams);

    public List<T> find(T findParams);

    public List<T> find(T findParams, List<Sort> sortList, Integer start, Integer limit);

    public int countQuery(List<CustomQueryParam> customQueryParams);

    public List<T> query(List<CustomQueryParam> customQueryParams, List<Sort> sortList);

    public List<T> query(List<CustomQueryParam> customQueryParams, List<Sort> sortList, Integer start, Integer limit);

    @Transactional(readOnly = false)
    public void insert(T t);

    @Transactional(readOnly = false)
    public void deleteById(Object id);

    @Transactional(readOnly = false)
    void logicDelete(T t);

    @Transactional(readOnly = false)
    public void update(T t);

    /**
     * 忽略了DataCommitException，一般适用于更新数据未变而进行update的情况
     * @param t
     * @return 数据变更数
     */
    @Transactional(readOnly = false)
    int updateIgnoreDataCommitException(T t);

}
