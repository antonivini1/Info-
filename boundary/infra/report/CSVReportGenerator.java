package boundary.infra.report;

import control.ReportGenerator;
import entity.UserReport;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVReportGenerator extends ReportGenerator {
    @Override
    public void saveReport(UserReport report, File file) {
        String header = "user,visits,minutesLoggedIn,comments,tickets,items";
        String data = report.getUsername() + "," + report.getVisits() + "," + report.getMinutesLoggedIn()
                + "," + report.getComments() + "," + report.getTickets() + "," + report.getItems();

        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(header + data);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Não foi possível criar o arquivo");
        }
    }
}
