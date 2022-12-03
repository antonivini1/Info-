package control;

import entity.Item;
import java.util.List;

public class ItemsManager {
    private Dao<String, Item> items ;

    public ItemsManager(DaoFactory<String, Item> factory) {
        items = factory.createDao();
    }

    public Item getItem(String title) {
        return items.get(title);
    }

    public List<Item> getItems() {
        return items.getAll();
    }

    public void addItem(String title, String author) {
        items.add(title, new Item(title, author));
    }

    public void deleteItem(String title) {
        items.delete(title);
    }
}
