package building.client;

import java.net.InetAddress;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

import building.climate_control.AdjustTemperatureRequest;
import building.climate_control.AdjustTemperatureResponse;
import building.climate_control.BuildingServiceGrpc;
import building.climate_control.CurrentTemperatureRequest;
import building.climate_control.CurrentTemperatureResponse;
import building.climate_control.HVACConditionRequest;
import building.climate_control.HVACConditionResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClimateControlDiscovery {
	public static class ClimateControlerListener implements ServiceListener {
		private static final Logger logger = Logger.getLogger(BuildingController.class.getName());
		@Override
		public void serviceAdded(ServiceEvent event) {
			// TODO Auto-generated method stub
			System.out.println(event.getName());
		}

		@Override
		public void serviceRemoved(ServiceEvent event) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void serviceResolved(ServiceEvent event) {
			ServiceInfo info = event.getInfo();
			int port = info.getPort();
			   ManagedChannel channel = ManagedChannelBuilder.forAddress ("localhost", port).usePlaintext().build();

		        BuildingServiceGrpc.BuildingServiceBlockingStub stub = BuildingServiceGrpc.newBlockingStub(channel);

		        AdjustTemperatureRequest request = AdjustTemperatureRequest.newBuilder().setAreaId("Room1").setTemperature(22).build();
		        AdjustTemperatureResponse response = stub.adjustTemperature(request);

		        //Printing adjust temperature response
		        System.out.println("Temperature adjustment was successful: " );
		        logger.info("Temperature adjustment was successful: " );

		        // Request to get current temperature
		        CurrentTemperatureRequest currentTemperatureRequest = CurrentTemperatureRequest.newBuilder()
		                .setAreaId("Room1")
		                .build();
		        CurrentTemperatureResponse currentTemperatureResponse = stub.currentTemperature(currentTemperatureRequest);
		        // Printing the response
		        System.out.println("Temperature in Room: " + currentTemperatureResponse.getTemperature());
		        System.out.println("Humidity in Room: " + currentTemperatureResponse.getHumidity());
		        System.out.println("Air Quality Index in Room: " + currentTemperatureResponse.getAirQualityIndex());

		        logger.info("Temperature in Room: " + currentTemperatureResponse.getTemperature());
		        logger.info("Humidity in Room: " + currentTemperatureResponse.getHumidity());
		        logger.info("Air Quality Index in Room: " + currentTemperatureResponse.getAirQualityIndex());

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

		        logger.info("HVAC Status: " + hvacConditionResponse.getStatus());
		        logger.info("Current Temperature: " + hvacConditionResponse.getCurrentTemperature());
		        logger.info("Set Temperature: " + hvacConditionResponse.getSetTemperature());
		        logger.info("Error Code: " + hvacConditionResponse.getErrorCode());

			
		}
		
	}
	
	public static void main(String []args) throws Exception {
		JmDNS jmDNS = JmDNS.create(InetAddress.getLocalHost());
		
		jmDNS.addServiceListener("_http._tcp.local.", new ClimateControlDiscovery.ClimateControlerListener());
		Thread.sleep(10000);
	}
}
