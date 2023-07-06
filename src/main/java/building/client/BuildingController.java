package building.client;

import building.AdjustTemperatureRequest;
import building.AdjustTemperatureResponse;
import building.BuildingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BuildingController {
public static void main (String[] args) {

	ManagedChannel channel = ManagedChannelBuilder.forAddress ("localhost", 5000).usePlaintext().build();
	
	BuildingServiceGrpc.BuildingServiceBlockingStub stub = BuildingServiceGrpc.newBlockingStub(channel);
	
	AdjustTemperatureRequest request = AdjustTemperatureRequest.newBuilder().setAreaId("Room1").setTemperature(22).build();
	AdjustTemperatureResponse response = stub.adjustTemperature(request);
	
	channel.shutdown();
	
	
}
	
}
