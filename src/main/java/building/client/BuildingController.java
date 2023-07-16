package building.client;

import building.climate_control.*;
import building.illumination_control.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BuildingController {

    public static void main(String[] args) {
        // Create a channel for climate control service
        ManagedChannel climateControlChannel = ManagedChannelBuilder.forAddress("localhost", 50054)
                .usePlaintext()
                .build();

        // Create a blocking stub for climate control service
        BuildingServiceGrpc.BuildingServiceBlockingStub climateControlStub =
                BuildingServiceGrpc.newBlockingStub(climateControlChannel);

        // Call climate control methods

        AdjustTemperatureRequest climateControlRequest = AdjustTemperatureRequest.newBuilder()
                .setAreaId("Room1")
                .setTemperature(22)
                .build();
        AdjustTemperatureResponse climateControlResponse = climateControlStub.adjustTemperature(climateControlRequest);

        System.out.println("Climate control adjustment was successful: " + climateControlResponse.getSuccess());

        CurrentTemperatureRequest currentTemperatureRequest = CurrentTemperatureRequest.newBuilder()
                .setAreaId("Room1")
                .build();
        CurrentTemperatureResponse currentTemperatureResponse = climateControlStub.currentTemperature(currentTemperatureRequest);

        System.out.println("Current temperature in Room: " + currentTemperatureResponse.getTemperature());
        System.out.println("Humidity in Room: " + currentTemperatureResponse.getHumidity());
        System.out.println("Air Quality Index in Room: " + currentTemperatureResponse.getAirQualityIndex());

        HVACConditionRequest hvacConditionRequest = HVACConditionRequest.newBuilder()
                .setAreaId("Room1")
                .build();
        HVACConditionResponse hvacConditionResponse = climateControlStub.getHVACCondition(hvacConditionRequest);

        System.out.println("HVAC Status: " + hvacConditionResponse.getStatus());
        System.out.println("Current Temperature: " + hvacConditionResponse.getCurrentTemperature());
        System.out.println("Set Temperature: " + hvacConditionResponse.getSetTemperature());
        System.out.println("Error Code: " + hvacConditionResponse.getErrorCode());

        // Shutdown the climate control channel
        climateControlChannel.shutdown();

        // Create a channel for illumination management service
        ManagedChannel illuminationManagementChannel = ManagedChannelBuilder.forAddress("localhost", 50055)
                .usePlaintext()
                .build();

        // Create a blocking stub for illumination management service
        IlluminationManagementServiceGrpc.IlluminationManagementServiceBlockingStub illuminationManagementStub =
                IlluminationManagementServiceGrpc.newBlockingStub(illuminationManagementChannel);

        // Call illumination management methods

        ModifyLightIntensityRequest modifyRequest = ModifyLightIntensityRequest.newBuilder()
                .setAreaId("Room1")
                .setIntensity(5)
                .build();
        ModifyLightIntensityResponse modifyResponse = illuminationManagementStub.modifyLightIntensity(modifyRequest);

        System.out.println("Light intensity modification was successful: " + modifyResponse.getSuccess());

        LightStatusRequest statusRequest = LightStatusRequest.newBuilder()
                .setAreaId("Room1")
                .build();
        LightStatusResponse statusResponse = illuminationManagementStub.lightStatus(statusRequest);

        System.out.println("Light status in Room: " + (statusResponse.getStatus() ? "ON" : "OFF"));
        System.out.println("Current light intensity in Room: " + statusResponse.getCurrentIntensity());

        ChangeLightStatusRequest changeRequest = ChangeLightStatusRequest.newBuilder()
                .setAreaId("Room1")
                .setStatus(false)
                .build();
        ChangeLightStatusResponse changeResponse = illuminationManagementStub.changeLightStatus(changeRequest);

        System.out.println("Light status change was successful: " + changeResponse.getSuccess());

        // Shutdown the illumination management channel
        illuminationManagementChannel.shutdown();
    }
}


