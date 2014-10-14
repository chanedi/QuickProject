package chanedi.bas.model;

import java.util.*;
import lombok.Data;
import javax.persistence.Table;
import chanedi.model.Entity;

@Data
@Table(name = "T_EVE_EVENT_PROCESS")
public class EventProcess extends Entity {

    private static final long serialVersionUID = -5227564951878481064L;

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
