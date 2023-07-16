package building.server;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import building.climate_control.BuildingServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BuildingServer {

	public static void main(String[] args) throws IOException {
		Server s = ServerBuilder.forPort(50052).addService(new BuildingServiceImpl()).build();
		JmDNS jmDNS = JmDNS.create(InetAddress.getLocalHost());
		ServiceInfo climateControl = ServiceInfo.create("_http._tcp.local.", "climateControl", 50052, "");
		jmDNS.registerService(climateControl);
	s.start();
	try {
		s.awaitTermination();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
