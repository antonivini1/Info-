package boundary.infra.dao;

import control.dao.Dao;
import control.dao.DaoFactory;

public class InMemoryDaoFactory<K, V> implements DaoFactory<K ,V> {

    @Override
    public Dao<K, V> createDao() {
        return new InMemoryDao<>();
    }
}
