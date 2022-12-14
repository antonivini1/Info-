package control;

import control.command.CommandData;
import control.dao.Dao;
import control.dao.DaoFactory;
import control.memento.Memento;
import control.validation.InvalidCredentialsException;
import control.visitor.EntityViewer;
import entity.Item;

import java.util.List;

public class ItemsManager implements Service {
    private Dao<String, Item> items;

    public ItemsManager(DaoFactory<String, Item> factory) {
        items = factory.createDao();
    }

    public Item getItem(String title) {
        return items.get(title);
    }

    public List<Item> getItems() {
        return items.getAll();
    }

    public void addItem(String title, String author, String description, String status, String location) {
        items.add(title, new Item(title, author, description, status, location));
    }

    public void deleteItem(String title) {
        items.delete(title);
    }

    public void EditDescription(String itemTitle, String newDescription) {
        Item item = getItem(itemTitle);
        item.setDescription(newDescription);
        items.update(item.getTitle(), item);
    }

    @Override
    public Memento createMemento() {
        return items.createMemento();
    }

    @Override
    public void restoreMemento(Memento m) {
        items.restoreMemento(m);
    }

    @Override
    public void insert(CommandData data) {
        List<Object> args = data.getArgs();
        addItem((String) args.get(0), (String) args.get(1), (String) args.get(2), (String) args.get(3), (String) args.get(4));
    }

    @Override
    public void delete(CommandData data) {
        List<Object> args = data.getArgs();
        deleteItem((String) args.get(0));
    }

    @Override
    public void update(CommandData data) throws InvalidCredentialsException {
        List<Object> args =  data.getArgs();
        EditDescription((String) args.get(0), (String) args.get(1));
    }
    @Override
    public void viewAll(EntityViewer visitor) {
        for (Item item : getItems()) {
            item.view(visitor);
        }
    }
}
