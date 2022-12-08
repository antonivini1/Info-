package control;

import entity.Ticket;

import java.util.List;

public class TicketsManager {
    private Dao<String, Ticket> tickets;
    public TicketsManager(DaoFactory<String, Ticket> factory) {
        tickets = factory.createDao();
    }
    public Ticket getTicket(String title) {
        return tickets.get(title);
    }

    public List<Ticket> getTickets() {
        return tickets.getAll();
    }

    public void addTicket(String title, String author, String description) {
        tickets.add(title, new Ticket(title, author, description));
    }

    public void deleteTicket(String title) {
        tickets.delete(title);
    }
}
