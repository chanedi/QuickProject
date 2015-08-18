package chanedi.dao.complexQuery;

import lombok.Getter;

/**
 * @author Chanedi
 */
public class NoValueQueryParam extends CustomQueryParam {

    private static final long serialVersionUID = 6470464711594746413L;
    @Getter
    private String condition;

    public NoValueQueryParam(String property, String condition) {
        super.property = property;
        this.condition = condition;
    }
}
