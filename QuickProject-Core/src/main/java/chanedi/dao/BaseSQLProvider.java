package chanedi.dao;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Table;

import chanedi.model.Entity;
import chanedi.dao.modelParser.ColumnTarget;
import chanedi.dao.modelParser.ModelUtils;
import chanedi.dao.modelParser.Property;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Chanedi on 14-2-10.
 */
public class BaseSQLProvider<T extends Entity> {

	private String tableName;
	private Class<?> modelClass;
	private static ThreadLocal<Class<?>> threadModelClass = new ThreadLocal<Class<?>>();
	private static final String OPERATOR_EQUAL = " = ";
	private static final String OPERATOR_LIKE = " like ";

	private void initFromThreadLocal() {
		modelClass = BaseSQLProvider.threadModelClass.get();
		tableName = modelClass.getAnnotation(Table.class).name();

		BaseSQLProvider.threadModelClass.remove();
	}

	public static void setModelClass(Class<?> modelClass) {
		BaseSQLProvider.threadModelClass.set(modelClass);
	}

	public String getAll() {
		initFromThreadLocal();
		SQL sql = SELECT_FROM();
		sql = ORDER(sql);
		return sql.toString();
	}

	public String getById() {
		initFromThreadLocal();
		SQL sql = SELECT_FROM().WHERE("ID = #{id}");
		return sql.toString();
	}

	public String count(T findParams) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException {
		initFromThreadLocal();
		SQL sql = new SQL() {
			{
				SELECT("COUNT(ID)");
				FROM(tableName);
			}
		};
		sql = WHERE(findParams, sql, OPERATOR_LIKE);
		return sql.toString();
	}

	public String find(T findParams) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException {
		initFromThreadLocal();
		SQL sql = SELECT_FROM();
		sql = WHERE(findParams, sql, OPERATOR_LIKE);
		sql = ORDER(sql);
		return sql.toString();
	}

	public String get(T findParams) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException {
		initFromThreadLocal();
		SQL sql = SELECT_FROM();
		sql = WHERE(findParams, sql, OPERATOR_EQUAL);
		sql = ORDER(sql);
		return sql.toString();
	}

	public String insert(final T t) throws IllegalAccessException, InvocationTargetException, NoSuchFieldException {
		initFromThreadLocal();
		// 设置默认值
		Date now = Calendar.getInstance().getTime();
		
		return new SQL() {
			{
				INSERT_INTO(tableName);
				
				List<Property> properties = ModelUtils.getProperties(t, ColumnTarget.INSERT);
				for (Property property : properties) {
					// 过滤不允许更新的字段
                    if (property.isId() || property.isNullValue(t)) {
                        continue;
                    }
					
					VALUES(property.getColumnName(), "#{" + property.getName() + "}");
					
				}
			}
		}.toString();
	}

	public String delete(String id) {
		initFromThreadLocal();
		return new SQL() {
			{
				DELETE_FROM(tableName);
				WHERE("ID = #{id}");
			}
		}.toString();
	}

	public String update(final T t) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException {
		initFromThreadLocal();
		
		return new SQL() {
			{
				UPDATE(tableName);
	
				List<Property> properties = ModelUtils.getProperties(t, ColumnTarget.UPDATE);
				for (Property property : properties) {
					// 过滤不允许更新的字段
					if (property.isId() || property.isNullValue(t)) {
						continue;
					}
	
					SET(property.getColumnName() + " = #{" + property.getName() + "}");
				}
	
				WHERE("ID = #{id}");
			}
		}.toString();
	}

	private SQL SELECT_FROM() {
		final List<Property> columns = ModelUtils.getProperties(modelClass, ColumnTarget.SELECT);
		return new SQL() {
			{
				for (Property property : columns) {
					SELECT(property.getColumnName());
				}
				FROM(tableName);
			}
		};
	}

	private SQL WHERE(T findParams, SQL sql, String operator) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		List<Property> properties = ModelUtils.getProperties(findParams, ColumnTarget.WHERE);
		for (Property property : properties) {
			sql.WHERE(property.getColumnName() + operator + "#{" + property.getName() + "}");
		}
		return sql;
	}

	private SQL ORDER(SQL sql) {
		List<Property> properties = ModelUtils.getProperties(modelClass, ColumnTarget.ORDER);
		for (Property property : properties) {
			sql.ORDER_BY(property.getOrder());
		}
		return sql;
	}

}
