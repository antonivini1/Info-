package boundary.infra.network;

import control.ExportUserService;
import entity.User;

public class ExternalServiceAdapter implements ExportUserService {
    private ExternalService externalService;
    ExternalServiceAdapter(ExternalService externalService) {
        this.externalService = externalService;
    }
    @Override
    public void uploadUserToAnotherService(User user) {
        UserJsonRequest json = new UserJsonRequest();

        json.id = user.getLogin();
        json.login = user.getLogin();
        json.isOnline = user.getLastLogin() < 300_000;
        json.auth = user.getToken();

        externalService.uploadUserToAnotherService(json);
    }
}
