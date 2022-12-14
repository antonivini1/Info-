package control.visitor;

import entity.Item;
import entity.Ticket;
import entity.User;

public class EntityPrinter implements EntityViewer {
    @Override
    public void ViewUser(User user) {
        System.out.println("Name: " + user.getLogin());
    }

    @Override
    public void ViewItem(Item item) {
        System.out.println("Item: " + item.getTitle());
        System.out.println("Description: " + item.getDescription());
    }

    @Override
    public void ViewTicket(Ticket ticket) {
        System.out.println("Ticket: " + ticket.getTitle());
        System.out.println("from User: " + ticket.getAuthor());
    }
}
