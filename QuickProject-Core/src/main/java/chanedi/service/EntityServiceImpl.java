package chanedi.service;

import chanedi.dao.EntityDAO;
import chanedi.dao.complexQuery.CustomQueryParam;
import chanedi.dao.complexQuery.Sort;
import chanedi.exception.DataCommitException;
import chanedi.model.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Chanedi
 */
public abstract class EntityServiceImpl<T extends Entity> implements EntityService<T> {

    protected final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private EntityDAO<T> entityDAO;

    public static Class<?> getEntityClass(EntityService entityService) {
        ParameterizedType genericSuperclass = (ParameterizedType) entityService.getClass().getGenericSuperclass();
        return (Class<?>) genericSuperclass.getActualTypeArguments()[0];
    }

    @Override
    public List<T> getAll() {
        return entityDAO.getAll();
    }

    @Override
    public T getById(Object id) {
        return entityDAO.getById(id);
    }

    @Override
    public int countGet(T findParams) {
        return entityDAO.countGet(findParams);
    }

    @Override
    public List<T> get(T findParams) {
        return entityDAO.get(findParams);
    }

    @Override
    public List<T> get(T findParams, List<Sort> sortList, Integer start, Integer limit) {
        return entityDAO.get(findParams, sortList, start, limit);
    }

    @Override
    public int countFind(T findParams) {
        return entityDAO.countFind(findParams);
    }

    @Override
    public List<T> find(T findParams) {
        return entityDAO.find(findParams);
    }

    @Override
    public List<T> find(T findParams, List<Sort> sortList, Integer start, Integer limit) {
        return entityDAO.find(findParams, sortList, start, limit);
    }

    @Override
    public int countQuery(List<CustomQueryParam> customQueryParams) {
        return entityDAO.countQuery(customQueryParams);
    }

    @Override
    public List<T> query(List<CustomQueryParam> customQueryParams, List<Sort> sortList) {
        return entityDAO.query(customQueryParams, sortList);
    }

    @Override
    public List<T> query(List<CustomQueryParam> customQueryParams, List<Sort> sortList, Integer start, Integer limit) {
        return entityDAO.query(customQueryParams, sortList, start, limit);
    }

    @Override
    public void insert(T t) {
        if (validate(t)) {
            if (entityDAO.insert(t) != 1) {
                throw new DataCommitException();
            }
        }
    }

    @Override
    public int insertIgnoreDataCommitException(T t) {
        if (validate(t)) {
            return entityDAO.insert(t);
        }
        return 0;
    }

    @Override
    public void insert(List<T> list) {
        for (T t : list) {
            insert(t);
        }
    }

    @Override
    public void deleteById(Object id) {
        if (entityDAO.delete(id) != 1) {
            throw new DataCommitException();
        }
    }

    @Override
    public int deleteByIdIgnoreDataCommitException(Object id) {
        return entityDAO.delete(id);
    }

    @Override
    public void deleteById(List<Object> list) {
        for (Object id : list) {
            deleteById(id);
        }
    }

    @Override
    public void deleteByIdIgnoreDataCommitException(List<Object> list) {
        for (Object id : list) {
            deleteByIdIgnoreDataCommitException(id);
        }
    }

    @Override
    public void delete(T t) {
        deleteById(t.getId());
    }

    @Override
    public int deleteIgnoreDataCommitException(T t) {
        return deleteByIdIgnoreDataCommitException(t.getId());
    }

    @Override
    public void delete(List<T> list) {
        for (T t : list) {
            delete(t);
        }
    }

    @Override
    public void deleteIgnoreDataCommitException(List<T> list) {
        for (T t : list) {
            deleteIgnoreDataCommitException(t);
        }
    }

    @Override
    public void update(T t) {
        if (validate(t)) {
            if (entityDAO.update(t) != 1) {
                throw new DataCommitException();
            }
        }
    }

    @Override
    public int updateIgnoreDataCommitException(T t) {
        if (validate(t)) {
            return entityDAO.update(t);
        }
        return 0;
    }

    @Override
    public void update(List<T> list) {
        for (T t : list) {
            update(t);
        }
    }

    @Override
    public void updateIgnoreDataCommitException(List<T> list) {
        for (T t : list) {
            update(t);
        }
    }

    /**
     * 模板方法
     * @param t
     */
    protected boolean validate(T t) {
        return true;
    }

}
