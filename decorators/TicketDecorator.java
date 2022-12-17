package entity;

import control.EntityViewer;

public class TicketDecorator extends Ticket {
    Ticket ticket;

    public TicketDecorator(Ticket umTicket) {
       ticket = umTicket;
    }
}
