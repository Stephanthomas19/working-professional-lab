import static org.junit.Assert.*;

import org.junit.Test;

import prof.*;

public class NetworkingProfessionalTest {
           
	NetworkingProfessional netProf = new NetworkingProfessional("John");
	
	Tool pliers = new Pliers("Wide Mouth");
	
	Router router = new CiscoRouter();
	
	@Test
	public void shouldFixRouter() {
		boolean fixing = netProf.fixRouter(router, pliers);
		assertTrue("Should be able to fix the router",fixing);
		
	}
	
}
