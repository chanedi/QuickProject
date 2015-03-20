package chanedi.dao.impl.mybatis.typeHandler;

import com.alibaba.fastjson.JSON;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by chanedi on 2015/1/5.
 */
public abstract class JSONTypeHandler<E extends JSON> extends BaseTypeHandler<E> {

    private Class<E> type;

    public JSONTypeHandler(Class<E> type) {
        if (type == null) throw new IllegalArgumentException("Type argument cannot be null");
        this.type = type;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.toJSONString());
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String jsonStr = rs.getString(columnName);
        if (rs.wasNull()) {
            return null;
        } else {
            return parseJSONString(jsonStr);
        }
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String jsonStr = rs.getString(columnIndex);
        if (rs.wasNull()) {
            return null;
        } else {
            return parseJSONString(jsonStr);
        }
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String jsonStr = cs.getString(columnIndex);
        if (cs.wasNull()) {
            return null;
        } else {
            return parseJSONString(jsonStr);
        }
    }

    protected abstract E parseJSONString(String jsonString);

}
