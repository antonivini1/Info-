package entity;

import control.EntityViewer;

import java.util.ArrayList;
import java.util.List;

public class Item {
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
    };

    public void view(EntityViewer entityViewer) {
        entityViewer.ViewItem(this);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addCommentary(String commentary) {
        this.commentaries.add(commentary);
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getStatus() {
        return this.status;
    }

    public String getLocation() {
        return this.location;
    }
}
