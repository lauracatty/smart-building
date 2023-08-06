package building.dns;

import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class BuildingDNS {
	public static void main(String []args) throws Exception {
		JmDNS jmDNS = JmDNS.create(InetAddress.getLocalHost());
		
		 // Registering the climateControl service
		ServiceInfo climateControl = ServiceInfo.create("_http._tcp.local.", "climateControl", 50052, "");
		jmDNS.registerService(climateControl);
		
		// Registering the IlluminationManagementService
        ServiceInfo illuminationService = ServiceInfo.create("_grpc._tcp.local.", "IlluminationManagementService", 50053, ""); // Assuming it runs on port 50053
        jmDNS.registerService(illuminationService);

     
		Thread.sleep(1000000);
	}
}
