package chanedi.bean.editor;

import java.beans.PropertyEditorSupport;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chanedi on 2015/1/19.
 */
public class TimeEditor extends PropertyEditorSupport {

    public void setAsText(String text) {
        DateFormat df = new SimpleDateFormat("H:mm");
        try {
            Date date = df.parse(text);
            Time time = new Time(date.getTime());
            setValue(time);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
