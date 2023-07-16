package building.dns;

import java.net.InetAddress;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class BuildingDNS {
	public static void main(String []args) throws Exception {
		JmDNS jmDNS = JmDNS.create(InetAddress.getLocalHost());
		ServiceInfo climateControl = ServiceInfo.create("_http._tcp.local.", "climateControl", 50052, "");
		jmDNS.registerService(climateControl);
		Thread.sleep(1000000);
	}
}