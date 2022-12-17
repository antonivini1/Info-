package entity;

import control.EntityViewer;

public class UserReportDecorator extends UserReport {
    UserReport userReport;

    public UserReportDecorator(UserReport umUserReport) {
       userReport = umUserReport;
    }

    @Override
     public String getUsername() {
        return firstName + " " + username + " " + lastName;
    }

    @Override
    public int getVisits() {
        return visits + selfVisit;
    }

    @Override
    public int getMinutesLoggedIn() {
        return minutesLoggedIn + minutesLoggedInBuffer;
    }

    @Override
    public int getComments() {
        return comments + selfComments;
    }

    @Override
    public int getTickets() {
        return tickets + selfTickets;
    }

    @Override
    public int getItems() {
        return items + selfItems;
    }
}