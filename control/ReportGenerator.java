package control;

import entity.UserReport;
import entity.User;

import java.io.File;

public abstract class ReportGenerator {

    public final void generateReport(User user, File file) {
        UserReport report = getReportForUser(user);
        saveReport(report, file);
    }

    public UserReport getReportForUser(User user) {
        return new UserReport(user.getLogin(), 10, 180, 12, 3, 1);
    }

    public abstract void saveReport(UserReport report, File file);
}
