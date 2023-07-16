package building.illumination_control;

import io.grpc.stub.StreamObserver;

public class IlluminationManagementImpl extends IlluminationManagementServiceGrpc.IlluminationManagementServiceImplBase {

    @Override
    public void modifyLightIntensity(ModifyLightIntensityRequest request, StreamObserver<ModifyLightIntensityResponse> responseObserver) {
        System.out.println("Modifying light intensity for area: " + request.getAreaId());
        System.out.println("New intensity: " + request.getIntensity());

        // Perform light intensity modification logic here
        boolean success = true; // Replace with actual logic and handle error cases if needed

        ModifyLightIntensityResponse response = ModifyLightIntensityResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void lightStatus(LightStatusRequest request, StreamObserver<LightStatusResponse> responseObserver) {
        System.out.println("Retrieving light status for area: " + request.getAreaId());

        // These values might come from some data source or lighting system in a real application
        boolean status = true;
        int currentIntensity = 50;

        LightStatusResponse response = LightStatusResponse.newBuilder()
                .setStatus(status)
                .setCurrentIntensity(currentIntensity)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void changeLightStatus(ChangeLightStatusRequest request, StreamObserver<ChangeLightStatusResponse> responseObserver) {
        System.out.println("Changing light status for area: " + request.getAreaId());
        System.out.println("New status: " + request.getStatus());

        // Perform light status change logic here
        boolean success = true; // Replace with actual logic and handle error cases if needed

        ChangeLightStatusResponse response = ChangeLightStatusResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

