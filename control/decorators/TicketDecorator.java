package control.decorators;

import entity.Ticket;

public class TicketDecorator extends Ticket {
    Ticket ticket;

    public TicketDecorator(Ticket umTicket) {
        super(umTicket);
        // ticket = umTicket;
    }

    public String sendEverythingAsBuffer() {
        return ticket.getTitle() + " " + ticket.getDescription() + " " + ticket.getAuthor();
    }
}
