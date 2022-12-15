package boundary.infra.persistance;

import control.backup.Memento;

import java.util.HashMap;

public class InMemoryDaoMemento<K, V> implements Memento {

    public InMemoryDaoMemento(HashMap<K, V> state) {
        this.state = state;
    }
    private HashMap<K, V> state;

    @Override
    public HashMap<K, V> getState() {
        return state;
    }
}
