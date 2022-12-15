package boundary.infra.adapter;

public interface ExternalService {

    void uploadUserToAnotherService(UserJsonRequest request);
}
