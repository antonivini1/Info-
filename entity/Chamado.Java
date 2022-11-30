package entity;

import java.io.File;
java.util.List;

public class Chamado{
    private String title;
    private String description;
    private String status;
    private List comentaries;
    private List attach;

    public Chamado(){
        this.title = null;
        this.desciption = null;
        this.status = null;
        this.comentaries = new ArrayList<String>();
        this.attach = new ArrayList<Object>();
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

    public void addComentary(String comentary){
        this.comentaries.add(comentary);
    }

    public void addFile(File file){
        this.attach.add(file);
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
}