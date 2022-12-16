package entity;

import control.EntityViewer;
import control.prototype.TicketPrototype;
import java.util.ArrayList;

// Representa entidade de chamado
public class Ticket extends TicketPrototype {

    public Ticket(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.status = null;
        this.commentaries = new ArrayList<>();
        this.attach = new ArrayList<>();

    }

    @Override
    public void view(EntityViewer entityViewer) {
        entityViewer.ViewTicket(this);
    }

    @Override
    public TicketPrototype clonar() {
        return new Ticket(this.title, this.author, this.description);
    }

}