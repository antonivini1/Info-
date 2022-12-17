package control.decorators;

import entity.UserReport;

public abstract class UserReportDecorator extends UserReport {
    UserReport userReport;

    public UserReportDecorator(UserReport umUserReport) {
        super(umUserReport);
        // userReport = umUserReport;
    }

    @Override
    public String getUsername() {
        return userReport.getUsername() + username;
    }

    @Override
    public int getVisits() {
        return userReport.getVisits() + visits;
    }

    @Override
    public int getMinutesLoggedIn() {
        return userReport.getMinutesLoggedIn() + minutesLoggedIn;
    }

    @Override
    public int getComments() {
        return userReport.getComments() + comments;
    }

    @Override
    public int getTickets() {
        return userReport.getTickets() + tickets;
    }

    @Override
    public int getItems() {
        return userReport.getItems() + items;
    }
}