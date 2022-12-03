package Control;

import boundary.infra.InMemoryDao;
import entity.Item;

import java.util.List;

public class ChamadosManager {
    private InMemoryDao<String, Item> chamados = new InMemoryDao<>();

    public Item getItem(String title) {
        return chamados.get(title);
    }

    public List<Item> getChamados() {
        return chamados.getAll();
    }

    public void addItem(String title, String author) {
        chamados.add(title, new Item(title, author));
    }

    public void deleteItem(String title) {
        chamados.delete(title);
    }
}
