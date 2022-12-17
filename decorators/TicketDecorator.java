package entity;

import control.EntityViewer;

public class TicketDecorator extends Ticket {
    Ticket ticket;

    public TicketDecorator(User umTicket) {
       ticket = umTicket;
    }
}
