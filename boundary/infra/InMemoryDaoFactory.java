package boundary.infra;

import control.Dao;
import control.DaoFactory;

public class InMemoryDaoFactory<K, V> implements DaoFactory<K ,V> {

    @Override
    public Dao<K, V> createDao() {
        return new InMemoryDao<>();
    }
}
