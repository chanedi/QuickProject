package chanedi.service;

import chanedi.dao.EntityDAO;
import chanedi.dao.complexQuery.CustomQueryParam;
import chanedi.dao.complexQuery.Sort;
import chanedi.exception.DataCommitException;
import chanedi.exception.LogicDeleteNotSupportException;
import chanedi.model.Entity;
import chanedi.model.ILogicDeletable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

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
        if (t == null) {
            return;
        }
        if (validate(t)) {
            if (entityDAO.insert(t) != 1) {
                throw new DataCommitException();
            }
        }
    }

    @Override
    public void deleteById(Object id) {
        if (id == null) {
            return;
        }
        if (entityDAO.delete(id) != 1) {
            throw new DataCommitException();
        }
    }

    @Override
    public void logicDelete(T t) {
        if (!(t instanceof ILogicDeletable)) {
            throw new LogicDeleteNotSupportException();
        }
        ((ILogicDeletable) t).setDelete();
        update(t);
    }

    @Override
    public void update(T t) {
        if (t == null) {
            return;
        }
        Assert.notNull(t.getId());
        if (validate(t)) {
            if (entityDAO.update(t) != 1) {
                throw new DataCommitException();
            }
        }
    }

    @Override
    public int updateIgnoreDataCommitException(T t) {
        if (t == null) {
            return 0;
        }
        Assert.notNull(t.getId());
        if (validate(t)) {
            return entityDAO.update(t);
        }
        return 0;
    }

    /**
     * 模板方法
     * @param t
     */
    protected boolean validate(T t) {
        return true;
    }

}
