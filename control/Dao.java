package Control;

import java.util.List;

public interface Dao<K, V> {
    public V get(K id);

    public List<V> getAll();

    public void add(K id, V value);

    public void update(K id, V value);

    public void delete(K id);
}
