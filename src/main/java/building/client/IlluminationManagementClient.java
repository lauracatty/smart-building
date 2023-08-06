package building.client;

import building.illumination_control.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class IlluminationManagementClient {
    public static void main(String[] args) {
        // Create a channel
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50054)
                                                      .usePlaintext()
                                                      .build();

        // Create a blocking stub
        IlluminationManagementServiceGrpc.IlluminationManagementServiceBlockingStub stub =
                IlluminationManagementServiceGrpc.newBlockingStub(channel);

        // Call the modifyLightIntensity method
        ModifyLightIntensityRequest modifyRequest = ModifyLightIntensityRequest.newBuilder()
                                                                               .setAreaId("Room1")
                                                                               .setIntensity(5)
                                                                               .build();
        ModifyLightIntensityResponse modifyResponse = stub.modifyLightIntensity(modifyRequest);
        System.out.println("Light intensity modification was successful: " + modifyResponse.getSuccess());

        // Call the lightStatus method
        LightStatusRequest statusRequest = LightStatusRequest.newBuilder()
                                                             .setAreaId("Room1")
                                                             .build();
        LightStatusResponse statusResponse = stub.lightStatus(statusRequest);
        System.out.println("Light status in Room: " + (statusResponse.getStatus() ? "ON" : "OFF"));
        System.out.println("Current light intensity in Room: " + statusResponse.getCurrentIntensity());

        // Call the changeLightStatus method
        ChangeLightStatusRequest changeRequest = ChangeLightStatusRequest.newBuilder()
                                                                         .setAreaId("Room1")
                                                                         .setStatus(false)
                                                                         .build();
        ChangeLightStatusResponse changeResponse = stub.changeLightStatus(changeRequest);
        System.out.println("Light status change was successful: " + changeResponse.getSuccess());

        // Shutdown the channel
        channel.shutdown();
    }
}
