package chanedi.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 该Properties能记录条目的先后顺序，见{@link PropertiesWithOrder#keysInOrder()}
 * @author Chanedi
 */
public class PropertiesWithOrder extends Properties {

    private List<Object> keyList = new ArrayList<Object>();

    @Override
    public synchronized Object put(Object key, Object value) {
        if (!keyList.contains(key)) {
            keyList.add(key);
        }
        return super.put(key, value);
    }

    /**
     * 返回key值，该key值顺序与文件中的顺序相同。
     * @return
     */
    public List<Object> keysInOrder() {
        return keyList;
    }

}
