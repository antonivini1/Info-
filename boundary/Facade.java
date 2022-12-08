package boundary;

import control.*;

public class Facade {
    public void createTicket(String title, String author, String description){
        TicketsManager.addTicket(title,author,description);
    }

    public void createLostItem(String title, String author, String description, String status, String location){
        ItemsManager.addItem(title, author, description, status, location);
    }
}
