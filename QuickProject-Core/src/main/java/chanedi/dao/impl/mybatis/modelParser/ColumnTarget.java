package chanedi.dao.impl.mybatis.modelParser;

/**
 * @author Chanedi
 */
public enum ColumnTarget {

    /**
     * 不包含@Transient的字段
     */
	SELECT,
    /**
     * 不包含@Transient的字段
     */
    WHERE,
    /**
     * 不包含@Transient的字段，且识别@Column.insertable
     */
    INSERT,
    /**
     * 不包含@Transient的字段，且识别@Column.updatable
     */
    UPDATE,
    /**
     * 包含允许SELECT的字段和@OrderColumn的字段
     */
    ORDER;
	
}
