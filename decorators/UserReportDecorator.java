package entity;

import control.EntityViewer;

public class UserReportDecorator extends UserReport {
    UserReport userReport;

    public UserReportDecorator(UserReport umUserReport) {
       userReport = umUserReport;
    }
}