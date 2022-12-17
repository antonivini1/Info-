package entity;

import control.EntityViewer;
import control.prototype.ItemPrototype;

import java.util.ArrayList;
import java.util.List;

public class Item extends ItemPrototype {
    protected String title;
    protected String description;
    protected String status;
    protected String author;
    protected String location;

    protected List<String> commentaries;

    public Item(String title, String author, String description, String status, String location) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.status = status;
        this.location = location;
        this.commentaries = new ArrayList<String>();
    }

    public Item(Item umItem) {
        this.title = umItem.title;
        this.author = umItem.author;
        this.description = umItem.description;
        this.status = umItem.status;
        this.location = umItem.location;
        this.commentaries = umItem.commentaries;

    };

    @Override
    public void view(EntityViewer entityViewer) {
        entityViewer.ViewItem(this);
    }

    @Override
    public ItemPrototype clonar() {
        return new Item(this);
    }

}
