package chanedi.bean.editor;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chanedi on 2015/1/19.
 */
public class CustomDateEditor extends PropertyEditorSupport {

    private String format = "yyyy-MM-dd";

    public CustomDateEditor() {
    }

    public CustomDateEditor(String format) {
        this.format = format;
    }

    public void setAsText(String text) {
        DateFormat df = new SimpleDateFormat(format);
        try {
            Date date = df.parse(text);
            setValue(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
