package chanedi.generator.model;

/**
 * Created by 羽霓 on 2014/6/10.
 */
public enum ColumnType {

    BOOLEAN("Boolean", "boolean", "textfield", "boolean"), STRING("String", "string", "textfield", "string"),
    DOUBLE("Double", "float", "numberfield", "numeric"), INT("Integer", "int", "numberfield", "numeric"), DATE("Date", "date", "datetimefield", "date");

    private String javaDes;
    private String jsDes;
    private String jsEditor;
    private String jsFilter;

    private ColumnType(String javaDes, String jsDes, String jsEditor, String jsFilter) {
        this.javaDes = javaDes;
        this.jsDes = jsDes;
        this.jsEditor = jsEditor;
        this.jsFilter = jsFilter;
    }

    public String getJavaType() {
        return javaDes;
    }

    public String getJsType() {
        return jsDes;
    }

    public String getJsEditor() {
        return jsEditor;
    }

    public String getJsFilter() {
        return jsFilter;
    }

}
