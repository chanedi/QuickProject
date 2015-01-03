package chanedi.action.view;

import lombok.Getter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UpdateResult implements Serializable {

    private static final long serialVersionUID = -861020293319335432L;
    @Getter
	private List<Object> rows = new ArrayList<Object>();

	public void addResult(Object object) {
		rows.add(object);
	}

	public void addResult(List<Object> objects) {
		rows.addAll(objects);
	}

}
