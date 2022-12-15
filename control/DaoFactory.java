package control;

public interface DaoFactory<K, V> {
    public Dao<K, V> createDao();
}
