package control;

import boundary.infra.network.UserJsonRequest;
import entity.User;

public interface ExportUserService {
    void uploadUserToAnotherService(User user);
}
