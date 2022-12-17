package entity;

public class UserReport {
    protected String username;
    protected int visits;
    protected int minutesLoggedIn;
    protected int comments;
    protected int tickets;
    protected int items;

    public UserReport(String username, int visits, int minutesLoggedIn, int comments, int tickets, int items) {
        this.username = username;
        this.visits = visits;
        this.minutesLoggedIn = minutesLoggedIn;
        this.comments = comments;
        this.tickets = tickets;
        this.items = items;
    }

    public UserReport(UserReport umUserReport) {
    };

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
