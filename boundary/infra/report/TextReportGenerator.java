package boundary.infra.report;

import control.ReportGenerator;
import entity.UserReport;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextReportGenerator extends ReportGenerator {
    @Override
    public void saveReport(UserReport report, File file) {
        String text
                = "Usuário: " + report.getUsername() + "\n"
                + "Visitas: " + report.getVisits() + "\n"
                + "Tempo Online: " + report.getMinutesLoggedIn() + " minutos" + "\n"
                + "Comentários: " + report.getComments() + "\n"
                + "Chamados: " + report.getTickets() + "\n"
                + "Items perdidos: " + report.getItems() + "\n";

        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Não foi possível criar o arquivo");
        }

    }
}
