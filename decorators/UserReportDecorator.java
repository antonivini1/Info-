package entity;

import control.EntityViewer;

public class UserReportDecorator extends UserReport {
    UserReport userReport;

    public UserReportDecorator(UserReport umUserReport) {
       userReport = umUserReport;
    }

    @Override
     public String getUsername() {
        return userReport.getUsername() + lastName;
    }

    @Override
    public int getVisits() {
        return userReport.getVisits() + selfVisit;
    }

    @Override
    public int getMinutesLoggedIn() {
        return userReport.getMinutesLoggedIn() + minutesLoggedInBuffer;
    }

    @Override
    public int getComments() {
        return userReport.getComments() + selfComments;
    }

    @Override
    public int getTickets() {
        return userReport.getTickets() + selfTickets;
    }

    @Override
    public int getItems() {
        return userReport.getItems() + selfItems;
    }
}