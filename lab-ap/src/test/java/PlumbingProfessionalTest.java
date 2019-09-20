
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import  prof.*;


public class PlumbingProfessionalTest{
	
	PlumbingProfessional plumber = new PlumbingProfessional("Tommy");
	
	Tool wrench = new Wrench("Stell Works");
	
	Pipe pipe = new PvcPipe();

	@Test
	public void shouldFixPvcPipe() {
		
		boolean fixing = plumber.fixPipe(pipe, wrench);
		
		assertTrue("Should be able to fix pipe",fixing);
	}

	
	

}
