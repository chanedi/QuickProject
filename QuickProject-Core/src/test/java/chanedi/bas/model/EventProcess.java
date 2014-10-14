package chanedi.bas.model;

import java.util.*;
import lombok.Data;
import chanedi.model.Entity;

@Data
public class EventProcess extends Entity {

    private static final long serialVersionUID = 4931040369800204073L;

    private String modifyUserCode;
    private String processType;
    private Double stepInterval;
    private Date modifyTime;
    private Date createTime;
    private Integer processSeq;
    private String eventTypeId;
    private String id;
    private String status;
    private String createUserCode;

}
