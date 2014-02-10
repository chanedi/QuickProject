package chanedi.service;

import java.util.List;

import chanedi.dao.BaseDAO;
import chanedi.dao.SqlInterceptor;
import chanedi.exception.DataCommitException;
import chanedi.model.Entity;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = { Exception.class }, readOnly = true)
public abstract class BaseServiceImpl<T extends Entity> implements BaseService<T> {

	@Autowired
	private BaseDAO<T> baseDAO;

	@Override
	public List<T> getAll() {
		return baseDAO.getAll();
	}

	@Override
	public T getById(String id) {
		return baseDAO.getById(id);
	}

	@Override
	public int count(T findParams) {
		return baseDAO.count(findParams);
	}

	@Override
	public List<T> find(T findParams, int start, int limit) {
		SqlInterceptor.setRowBounds(new RowBounds(start, limit));
		return baseDAO.find(findParams);
	}

	@Override
	@Transactional(readOnly = false)
	public void insert(T t) throws DataCommitException {
		if (baseDAO.insert(t) != 1) {
			throw new DataCommitException();
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void insert(List<T> list) throws DataCommitException {
		for (T t : list) {
			if (baseDAO.insert(t) != 1) {
				throw new DataCommitException();
			}
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteById(String id) throws DataCommitException {
		if (baseDAO.delete(id) != 1) {
			throw new DataCommitException();
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteById(List<String> list) throws DataCommitException {
		for (String id : list) {
			if (baseDAO.delete(id) != 1) {
				throw new DataCommitException();
			}
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void update(T t) throws DataCommitException {
		if (baseDAO.update(t) != 1) {
			throw new DataCommitException();
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void update(List<T> list) throws DataCommitException {
		for (T t : list) {
			if (baseDAO.update(t) != 1) {
				throw new DataCommitException();
			}
		}
	}

}
