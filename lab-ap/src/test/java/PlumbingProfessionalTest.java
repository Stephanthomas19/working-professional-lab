
import static org.junit.Assert.assertTrue;

import  prof.*;

public class PlumbingProfessionalTest{
	
	PlumbingProfessional plumber = new PlumbingProfessional();
	
	Tool wrench = new Wrench();
	Pipe pipe = new PvcPipe();
	
	public void shouldFixPvcPipe() {
		boolean fixing = plumber.fixPipe(pipe, wrench);
		assertTrue("Should be able to fix pipe",fixing);
	}

	
	

}
