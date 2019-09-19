import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import prof.*;



public class NetworkingProfessionalTest {
           
	NetworkingProfessional netProf = new NetworkingProfessional();
	
	Tool pliers = new Pliers();
	Router router = new CiscoRouter();
	
	public void shouldFixRouter() {
		boolean fixing = netProf.fixRouter(router, pliers);
		assertTrue("Should be able to fix the router",fixing);
		
	}
	
}
