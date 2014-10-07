package chanedi.dao.complexQuery;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by jijy on 2014/7/4.
 */
@Data
public class Sort implements Serializable {

    private static final long serialVersionUID = 7026434198845897214L;
    private String property;
    private String direction;

}
