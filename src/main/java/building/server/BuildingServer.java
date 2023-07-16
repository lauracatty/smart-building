package building.server;

import java.io.IOException;
import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import building.climate_control.BuildingServiceImpl;
import building.illumination_control.IlluminationManagementImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class BuildingServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Create server for climate control
        Server climateControlServer = ServerBuilder.forPort(50054)
                .addService(new BuildingServiceImpl())
                .build();

        // Create server for illumination management
        Server illuminationManagementServer = ServerBuilder.forPort(50055)
                .addService(new IlluminationManagementImpl())
                .build();

        JmDNS jmDNS = JmDNS.create(InetAddress.getLocalHost());

        // Register climate control service
        ServiceInfo climateControl = ServiceInfo.create("_http._tcp.local.", "climateControl", 50054, "");
        jmDNS.registerService(climateControl);

        // Register illumination management service
        ServiceInfo illuminationManagement = ServiceInfo.create("_http._tcp.local.", "illuminationManagement", 50055, "");
        jmDNS.registerService(illuminationManagement);

        // Start the servers
        climateControlServer.start();
        illuminationManagementServer.start();

        System.out.println("Climate control server started, listening on " + 50054);
        System.out.println("Illumination management server started, listening on " + 50055);

        // Don't exit the main thread. Wait until server is terminated.
        climateControlServer.awaitTermination();
        illuminationManagementServer.awaitTermination();
    }
}

