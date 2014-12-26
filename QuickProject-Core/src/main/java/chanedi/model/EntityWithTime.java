package chanedi.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by chanedi on 2014/12/26.
 */
@Data
public abstract class EntityWithTime extends Entity {

    private Date createTime;

    private Date modifyTime;

}
