package building.client;

import building.*;
import building.AdjustTemperatureRequest;
import building.AdjustTemperatureResponse;
import building.BuildingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BuildingController {
public static void main (String[] args) {

	ManagedChannel channel = ManagedChannelBuilder.forAddress ("localhost", 50051).usePlaintext().build();
	
	BuildingServiceGrpc.BuildingServiceBlockingStub stub = BuildingServiceGrpc.newBlockingStub(channel);
	
	AdjustTemperatureRequest request = AdjustTemperatureRequest.newBuilder().setAreaId("Room1").setTemperature(22).build();
	AdjustTemperatureResponse response = stub.adjustTemperature(request);
	
	//Printing adjust temperature response
    System.out.println("Temperature adjustment was successful: " );
	
	
	
     
     // Request to get current temperature
     CurrentTemperatureRequest currentTemperatureRequest = CurrentTemperatureRequest.newBuilder()
             .setAreaId("Room1")
             .build();
     CurrentTemperatureResponse currentTemperatureResponse = stub.currentTemperature(currentTemperatureRequest);
  // Printing the response
     System.out.println("Temperature in Room: " + currentTemperatureResponse.getTemperature());
     System.out.println("Humidity in Room: " + currentTemperatureResponse.getHumidity());
     System.out.println("Air Quality Index in Room: " + currentTemperatureResponse.getAirQualityIndex());

     

     
     // Request to get HVAC condition
  // Request to get HVAC condition
     HVACConditionRequest hvacConditionRequest = HVACConditionRequest.newBuilder()
             .setAreaId("Room1")
             .build();
     HVACConditionResponse hvacConditionResponse = stub.getHVACCondition(hvacConditionRequest);
     // Printing the response
     System.out.println("HVAC Status: " + hvacConditionResponse.getStatus());
     System.out.println("Current Temperature: " + hvacConditionResponse.getCurrentTemperature());
     System.out.println("Set Temperature: " + hvacConditionResponse.getSetTemperature());
     System.out.println("Error Code: " + hvacConditionResponse.getErrorCode());
	channel.shutdown();
	
	
}
	
}
