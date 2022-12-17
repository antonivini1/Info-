package control.prototype;

import java.util.List;

import control.EntityViewer;

public abstract class ItemPrototype {
  protected String title;
  protected String description;
  protected String status;
  protected String author;
  protected String location;
  protected List<String> commentaries;

  public abstract void view(EntityViewer entityViewer);

  public abstract ItemPrototype clonar();

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
