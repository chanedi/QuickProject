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

    /**
     * 忽略了DataCommitException，自行处理数据变更数为0的情况
     * @param t
     * @return 数据变更数
     */
    int insertIgnoreDataCommitException(T t);

    @Transactional(readOnly = false)
    public void insert(List<T> list);

    @Transactional(readOnly = false)
    public void deleteById(Object id);

    /**
     * 忽略了DataCommitException，自行处理数据变更数为0的情况
     * @param id
     * @return 数据变更数
     */
    int deleteByIdIgnoreDataCommitException(Object id);

    @Transactional(readOnly = false)
    public void deleteById(List<Object> list);

    void deleteByIdIgnoreDataCommitException(List<Object> list);

    @Transactional(readOnly = false)
    public void delete(T t);

    /**
     * 忽略了DataCommitException，自行处理数据变更数为0的情况
     * @param t
     * @return 数据变更数
     */
    int deleteIgnoreDataCommitException(T t);

    @Transactional(readOnly = false)
    public void delete(List<T> list);

    void deleteIgnoreDataCommitException(List<T> list);

    @Transactional(readOnly = false)
    public void update(T t);

    /**
     * 忽略了DataCommitException，一般适用于更新数据未变而进行update的情况
     * @param t
     * @return 数据变更数
     */
    int updateIgnoreDataCommitException(T t);

    @Transactional(readOnly = false)
    public void update(List<T> list);

    void updateIgnoreDataCommitException(List<T> list);

}
