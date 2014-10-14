package chanedi.service;

import chanedi.dao.complexQuery.CustomQueryParam;
import chanedi.dao.complexQuery.Sort;
import chanedi.exception.DataCommitException;
import chanedi.model.Entity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.transaction.annotation.Transactional;

import java.io.OutputStream;
import java.util.List;

/**
 * Created by Chanedi
 */
@Transactional(rollbackFor = { Exception.class }, readOnly = true)
public interface EntityService<T extends Entity> {

    public List<T> getAll();

    public T getById(Object id);

    public int countGet(T findParams);

    public List<T> get(T findParams);

    public List<T> get(T findParams, Integer start, Integer limit);

    public int countFind(T findParams);

    public List<T> find(T findParams);

    public List<T> find(T findParams, Integer start, Integer limit);

    public int countQuery(List<CustomQueryParam> customQueryParams);

    public List<T> query(List<CustomQueryParam> customQueryParams, List<Sort> sortList);

    public List<T> query(List<CustomQueryParam> customQueryParams, List<Sort> sortList, Integer start, Integer limit);

    @Transactional(readOnly = false)
    public void insert(T t);

    @Transactional(readOnly = false)
    public void insert(List<T> list);

    @Transactional(readOnly = false)
    public void deleteById(Object id);

    @Transactional(readOnly = false)
    public void deleteById(List<Object> list);

    @Transactional(readOnly = false)
    public void delete(T t);

    @Transactional(readOnly = false)
    public void delete(List<T> list);

    @Transactional(readOnly = false)
    public void update(T t);

    @Transactional(readOnly = false)
    public void update(List<T> list);

}
