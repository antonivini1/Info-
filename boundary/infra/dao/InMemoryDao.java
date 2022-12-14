package boundary.infra.dao;

import control.dao.Dao;
import control.memento.Memento;

import java.util.ArrayList;
import java.util.HashMap;

public class InMemoryDao<K, V> implements Dao<K, V> {
    private HashMap<K, V> data = new HashMap<>();
    public V get(K id) {
        return data.get(id);
    }

    public ArrayList<V> getAll() {
        return new ArrayList<V>(data.values());
    }

    public void add(K id, V item) {
        data.put(id, item);
    }

    public void update(K id, V item) {
        data.put(id, item);
    }

    public void delete(K id) {
        data.remove(id);
    }

    public Memento createMemento() {
        return new InMemoryDaoMemento<>(data);
    }

    @Override
    public void restoreMemento(Memento m) {
        data = ((InMemoryDaoMemento<K, V>) m).getState();
    }

}
