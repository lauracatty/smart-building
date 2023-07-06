package building;

import building.BuildingServiceGrpc.BuildingServiceImplBase;
import io.grpc.stub.StreamObserver;

public class BuildingServiceImpl extends BuildingServiceImplBase{
//basic structure of grpc implementeation
	
	@Override
	public void adjustTemperature (AdjustTemperatureRequest request, StreamObserver <AdjustTemperatureResponse> responseObserver) {
		//always takes two arguments: first is the request, second is the streamobserver (from the Grpc itself - takes adjustt
		//temperature response as a method. We use the request to get data and create the response object
	
		System.out.println("Request Area ID"+request.getAreaId());
		System.out.println("Request Temperature "+ request.getTemperature());
		
		//responseobjecet - with newBuilder and set the properties you need (true and false with error message if needed)

		AdjustTemperatureResponse response= AdjustTemperatureResponse.newBuilder().setSuccess(true).build();
		
		//data will be returned and the request is finished
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
				
		
	}

	@Override
	public void currentTemperature(CurrentTemperatureRequest request,
			StreamObserver<CurrentTemperatureResponse> responseObserver) {
	
		
	}

	@Override
	public void getHVACCondition(HVACConditionRequest request, StreamObserver<HVACConditionResponse> responseObserver) {

	}
	
	
	
	
}
