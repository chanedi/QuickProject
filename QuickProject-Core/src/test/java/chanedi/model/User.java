package chanedi.model;

import lombok.Data;

import javax.persistence.Table;

/**
 * Created by chanedi on 14-3-13.
 */
@Data
@Table(name = "USER")
public class User extends Entity {

    private String id;
    private String name;

}
