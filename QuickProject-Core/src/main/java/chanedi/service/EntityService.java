package chanedi.service;

import java.util.List;

import chanedi.exception.DataCommitException;
import chanedi.model.Entity;

public interface EntityService<T extends Entity> {
	
	public List<T> getAll();
	
	public T getById(String id);

	public int count(T findParams);
	
	public List<T> find(T findParams, int start, int limit);

	public void insert(T t) throws DataCommitException;
	
	public void insert(List<T> list) throws DataCommitException;

	public void deleteById(String id) throws DataCommitException;
	
	public void deleteById(List<String> list) throws DataCommitException;

	public void update(T t) throws DataCommitException;
	
	public void update(List<T> list) throws DataCommitException;

}
