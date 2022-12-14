package entity;

import control.visitor.EntityViewer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Representa entidade de chamado
public class Ticket {
    private String title;

    private String author;
    private String description;
    private String status;
    private List<String> commentaries;
    private List<File> attach;

    public Ticket(String title, String author, String description){
        this.title = title;
        this.author = author;
        this.description = description;
        this.status = null;
        this.commentaries = new ArrayList<>();
        this.attach = new ArrayList<>();
    }

    public void view(EntityViewer entityViewer) {
        entityViewer.ViewTicket(this);
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
        this.commentaries.add(comentary);
    }

    public void addFile(File file){
        this.attach.add(file);
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription(){
        return this.description;
    }

    public String getStatus(){
        return this.status;
    }
}