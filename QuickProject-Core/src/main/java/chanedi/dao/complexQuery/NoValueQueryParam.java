package chanedi.dao.complexQuery;

import lombok.Getter;

/**
 * @author Chanedi
 */
public class NoValueQueryParam extends CustomQueryParam {

    @Getter
    private String condition;

    public NoValueQueryParam(String property, String condition) {
        super.property = property;
        this.condition = condition;
    }
}
