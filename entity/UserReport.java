package entity;

public class UserReport {
    private String username;
    private int visits;
    private int minutesLoggedIn;
    private int comments;
    private int tickets;
    private int items;

    public UserReport(String username, int visits, int minutesLoggedIn, int comments, int tickets, int items) {
        this.username = username;
        this.visits = visits;
        this.minutesLoggedIn = minutesLoggedIn;
        this.comments = comments;
        this.tickets = tickets;
        this.items = items;
    }

    public String getUsername() {
        return username;
    }

    public int getVisits() {
        return visits;
    }

    public int getMinutesLoggedIn() {
        return minutesLoggedIn;
    }

    public int getComments() {
        return comments;
    }

    public int getTickets() {
        return tickets;
    }

    public int getItems() {
        return items;
    }
}
