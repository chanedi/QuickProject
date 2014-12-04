package chanedi.model;

import lombok.Data;

import java.io.Serializable;

/**
 Example:

 @ Data
 @ Table(name = "T_BAS_USER")
 public class User extends Entity {

 @ Id
 private String id;

 @ OrderColumn
 private String name;

 @ OrderColumn(name = "DESC")
 private String userCode; // default column name : USER_CODE

 @ Column(name = "PASS")
 private String password;

 private String status;

 @ Column(name = "S_COLUMN") // default column name : SOME_COLUMN
 private String getSomeColumn() {
 return null;
 }

 @ Transient
 private String getSomeNoneColumn() {
 return null;
 }

 }
 *
 * @author Chanedi
 */
@Data
public abstract class Entity implements Serializable {

    private static final long serialVersionUID = 4212679023438415647L;

    public abstract Object getId();

    public abstract void setId(Object id);

}