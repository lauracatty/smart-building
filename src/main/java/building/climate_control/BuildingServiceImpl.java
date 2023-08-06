package building.climate_control;
import building.climate_control.*;
import building.climate_control.ClimateControl;

import building.climate_control.BuildingServiceGrpc.BuildingServiceImplBase;

import building.climate_control.BuildingServiceGrpc;
import building.climate_control.BuildingServiceGrpc.BuildingServiceImplBase;
import io.grpc.stub.StreamObserver;

public class BuildingServiceImpl extends BuildingServiceImplBase{
//basic structure of grpc implementeation - created variable for the database
	ClimateControl climatecontrol; 
	
	//constructor - initiate DB
	
	public BuildingServiceImpl() {
	super();
	this.climatecontrol = new ClimateControl();
}

	@Override
	public void adjustTemperature (AdjustTemperatureRequest request, StreamObserver <AdjustTemperatureResponse> responseObserver) {
		//always takes two arguments: first is the request, second is the streamobserver (from the Grpc itself - takes adjustt
		//temperature response as a method. We use the request to get data and create the response object
	
		System.out.println("In which Room would you like to change temperature?"+request.getAreaId());
		System.out.println("Please enter temperature in Celsius "+ request.getTemperature());
		
		//how to use a database
		this.climatecontrol.updateTemperature(request.getAreaId(), request.getTemperature());
		//responseobjecet - with newBuilder and set the properties you need (true and false with error message if needed)

		AdjustTemperatureResponse response= AdjustTemperatureResponse.newBuilder().setSuccess(true).build();
		
		//data will be returned and the request is finished
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		
				
		
	}

	@Override
	public void currentTemperature(CurrentTemperatureRequest request,
			StreamObserver<CurrentTemperatureResponse> responseObserver) {
		
		
	
		float temperature = this.climatecontrol.getTemperature(request.getAreaId());
		System.out.println("Fetching current temperature for Room: " + request.getAreaId());

        // These values might come from some data source or sensor in real application
		
        float humidity = 30.5f;
        int airQualityIndex = 45;

        CurrentTemperatureResponse response = CurrentTemperatureResponse.newBuilder()
            .setTemperature(temperature)
            .setHumidity(humidity)
            .setAirQualityIndex(airQualityIndex)
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    
		
	}

	@Override
	public void getHVACCondition(HVACConditionRequest request, StreamObserver<HVACConditionResponse> responseObserver) {

		   System.out.println("Fetching HVAC condition for Room: " + request.getAreaId());

	        // These values might come from some data source or HVAC system in real application
	        boolean status = true;
	        float currentTemperature = 24.5f;
	        float setTemperature = 22.5f;
	        String errorCode = "NO_ERROR";

	        HVACConditionResponse response = HVACConditionResponse.newBuilder()
	            .setStatus(status)
	            .setCurrentTemperature(currentTemperature)
	            .setSetTemperature(setTemperature)
	            .setErrorCode(errorCode)
	            .build();

	        responseObserver.onNext(response);
	        responseObserver.onCompleted();
		
		
	}
	
	
	
	
}
