package entity;

public class Item{
    private String title;
    private String description;
    private String status;
    private String author;
    private String location;
    private List comentaries;

    public Item(String author){
        this.author = author;
        this.title = null;
        this.desciption = null;
        this.status = null;
        this.location = null;
        this.comentaries = new ArrayList<String>();
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

    public void addComentary(String comentary){
        this.comentaries.add(comentary);
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

    public void getLocation(String location){
        return this.location;
    }
}