package chanedi.dao.impl.mybatis.session;

import java.util.HashMap;
import java.util.Map;

/**
 * 修改自：
 * org.mybatis:mybatis:3.2.3
 * org.apache.ibatis.session.Configuration$StrictMap
 *
 * @author Chanedi
 */
public class FirstStrictMap<V> extends HashMap<String, V> {

    private static final long serialVersionUID = -4950446264854982944L;
    private String name;

    public FirstStrictMap(String name, int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
        this.name = name;
    }

    public FirstStrictMap(String name, int initialCapacity) {
        super(initialCapacity);
        this.name = name;
    }

    public FirstStrictMap(String name) {
        super();
        this.name = name;
    }

    public FirstStrictMap(String name, Map<String, ? extends V> m) {
        super(m);
        this.name = name;
    }

    @SuppressWarnings("unchecked")
    public V put(String key, V value) {
        if (containsKey(key))
            return get(key);
        if (key.contains(".")) {
            final String shortKey = getShortName(key);
            if (super.get(shortKey) == null) {
                super.put(shortKey, value);
            } else {
                super.put(shortKey, (V) new Ambiguity(shortKey));
            }
        }
        return super.put(key, value);
    }

    public V get(Object key) {
        V value = super.get(key);
        if (value == null) {
            throw new IllegalArgumentException(name + " does not contain value for " + key);
        }
        if (value instanceof Ambiguity) {
            throw new IllegalArgumentException(((Ambiguity) value).getSubject() + " is ambiguous in " + name
                    + " (try using the full name including the namespace, or rename one of the entries)");
        }
        return value;
    }

    private String getShortName(String key) {
        final String[] keyparts = key.split("\\.");
        final String shortKey = keyparts[keyparts.length - 1];
        return shortKey;
    }

    protected static class Ambiguity {
        private String subject;

        public Ambiguity(String subject) {
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }
    }
}
