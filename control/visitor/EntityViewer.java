package control.visitor;

import entity.Item;
import entity.Ticket;
import entity.User;

// Visitor
public interface EntityViewer {
    void ViewUser(User user);
    void ViewItem(Item item);
    void ViewTicket(Ticket ticket);
}
