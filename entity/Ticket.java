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

    protected Ticket(Ticket umTicket) {
        this.title = umTicket.title;
        this.author = umTicket.author;
        this.description = umTicket.description;
        this.status = umTicket.status;
        this.commentaries = umTicket.commentaries;
        this.attach = umTicket.attach;
    }

    @Override
    public void view(EntityViewer entityViewer) {
        entityViewer.ViewTicket(this);
    }

    @Override
    public TicketPrototype clonar() {
        return new Ticket(this);
    }

}