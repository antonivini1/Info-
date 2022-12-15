package boundary.infra.adapter;

import entity.User;

public class ExternalServiceAdapter implements ExternalService {
    private User user;
    ExternalServiceAdapter(User user) {
        this.user = user;
    }
    @Override
    public void uploadUserToAnotherService(UserJsonRequest request) {
        UserJsonRequest json = new UserJsonRequest();

        json.id = user.getLogin();
        json.login = user.getLogin();
        json.isOnline = user.getLastActivity() < 300_000;
        json.auth = user.getToken();

        makeNetworkCall(json);
    }

    private void makeNetworkCall(UserJsonRequest request) {
        //
    }
}
