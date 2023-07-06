package building.server;

import java.io.IOException;

import building.BuildingServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BuildingServer {

	public static void main(String[] args) throws IOException {
		Server s = ServerBuilder.forPort(5000).addService(new BuildingServiceImpl()).build();
	s.start();
	try {
		s.awaitTermination();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
