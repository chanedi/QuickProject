package chanedi.dao.complexQuery;

import lombok.Getter;

/**
 * @author Chanedi
 */
public class WithValueQueryParam extends CustomQueryParam {

    @Getter
    private Object value;
    @Getter
    private String operator;

    public WithValueQueryParam(String property, String operator, Object value) {
        super.property = property;
        this.operator = operator;
        this.value = value;
    }

}
