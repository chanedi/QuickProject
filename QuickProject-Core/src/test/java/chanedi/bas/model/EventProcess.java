package chanedi.bas.model;

import chanedi.model.Entity;
import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

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
    private Object id;
    private String status;
    private String createUserCode;

}
