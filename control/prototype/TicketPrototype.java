package control.prototype;

import java.util.List;
import java.io.File;
import control.EntityViewer;

public abstract class TicketPrototype {

  protected String title;
  protected String author;
  protected String description;
  protected String status;
  protected List<String> commentaries;
  protected List<File> attach;

  public abstract void view(EntityViewer entityViewer);

  public abstract TicketPrototype clonar();

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void addComentary(String comentary) {
    this.commentaries.add(comentary);
  }

  public void addFile(File file) {
    this.attach.add(file);
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return author;
  }

  public String getDescription() {
    return this.description;
  }

  public String getStatus() {
    return this.status;
  }

}
