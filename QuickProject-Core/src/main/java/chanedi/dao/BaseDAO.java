package chanedi.dao;

import java.util.List;

import chanedi.model.Entity;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

/**
 * Created by chanedi on 14-2-10.
 */
public interface BaseDAO<T extends Entity> {

	@SelectProvider(type = BaseSQLProvider.class, method = "getAll")
	@ResultMap("getMap")
	public List<T> getAll();

	@SelectProvider(type = BaseSQLProvider.class, method = "getById")
	@ResultMap("getMap")
	public T getById(String id);

	@SelectProvider(type = BaseSQLProvider.class, method = "count")
	public int count(T findParams);
	
	@SelectProvider(type = BaseSQLProvider.class, method = "get")
	@ResultMap("getMap")
	public T getOne(T findParams);

	@SelectProvider(type = BaseSQLProvider.class, method = "get")
	@ResultMap("getMap")
	public List<T> get(T findParams);
	
	@SelectProvider(type = BaseSQLProvider.class, method = "find")
	@ResultMap("getMap")
	public List<T> find(T findParams);

	@InsertProvider(type = BaseSQLProvider.class, method = "insert")
	@Options(keyProperty = "id")
	public int insert(T t);
	
	@DeleteProvider(type = BaseSQLProvider.class, method = "delete")
	public int delete(String id);

	@UpdateProvider(type = BaseSQLProvider.class, method = "update")
	public int update(T t);

}
