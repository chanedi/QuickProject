package chanedi.service;

import java.util.List;

import chanedi.dao.EntityDAO;
import chanedi.dao.SqlInterceptor;
import chanedi.exception.DataCommitException;
import chanedi.model.Entity;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = { Exception.class }, readOnly = true)
public abstract class EntityServiceImpl<T extends Entity> implements EntityService<T> {

	@Autowired
	private EntityDAO<T> entityDAO;

	@Override
	public List<T> getAll() {
		return entityDAO.getAll();
	}

	@Override
	public T getById(String id) {
		return entityDAO.getById(id);
	}

	@Override
	public int count(T findParams) {
		return entityDAO.count(findParams);
	}

	@Override
	public List<T> find(T findParams, int start, int limit) {
		SqlInterceptor.setRowBounds(new RowBounds(start, limit));
		return entityDAO.find(findParams);
	}

	@Override
	@Transactional(readOnly = false)
	public void insert(T t) throws DataCommitException {
		if (entityDAO.insert(t) != 1) {
			throw new DataCommitException();
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void insert(List<T> list) throws DataCommitException {
		for (T t : list) {
			if (entityDAO.insert(t) != 1) {
				throw new DataCommitException();
			}
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteById(String id) throws DataCommitException {
		if (entityDAO.delete(id) != 1) {
			throw new DataCommitException();
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteById(List<String> list) throws DataCommitException {
		for (String id : list) {
			if (entityDAO.delete(id) != 1) {
				throw new DataCommitException();
			}
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void update(T t) throws DataCommitException {
		if (entityDAO.update(t) != 1) {
			throw new DataCommitException();
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void update(List<T> list) throws DataCommitException {
		for (T t : list) {
			if (entityDAO.update(t) != 1) {
				throw new DataCommitException();
			}
		}
	}

}
