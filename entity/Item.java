package entity;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String title;
    private String description;
    private String status;
    private String author;
    private String location;

    private List<String> commentaries;

    public Item(String title, String author){
        this.title = title;
        this.author = author;
        this.title = null;
        this.description = null;
        this.status = null;
        this.location = null;
        this.commentaries = new ArrayList<String>();
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void addCommentary(String commentary){
        this.commentaries.add(commentary);
    }

    public String getTitle(){
        return this.title;
    }

    public String getDescription(){
        return this.description;
    }

    public String getStatus(){
        return this.status;
    }

    public String getLocation(String location){
        return this.location;
    }
}
