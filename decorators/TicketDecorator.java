package entity;

import control.EntityViewer;

public class TicketDecorator extends Ticket {
    Ticket ticket;

    public TicketDecorator(Ticket umTicket) {
       ticket = umTicket;
    }

    public String sendEverythingAsBuffer(){
        return ticket.getTitle() + " " + ticket.getDescription() + " " + ticket.getAuthor();
    }
}
