package boundary.infra.network;

public interface ExternalService {

    void uploadUserToAnotherService(UserJsonRequest request);
}
