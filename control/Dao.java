package control;

import control.backup.Restorable;

import java.util.List;

public interface Dao<K, V> extends Restorable {
    public V get(K id);

    public List<V> getAll();

    public void add(K id, V value);

    public void update(K id, V value);

    public void delete(K id);
}
