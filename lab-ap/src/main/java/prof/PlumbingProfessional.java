package prof;

public class PlumbingProfessional extends Professional  

implements IPlumbingProfessional

{
   
    public PlumbingProfessional() {
    	 super(null);
    }
    
	public PlumbingProfessional(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCertification(Certification cert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean fixPipe(Pipe pipe, Tool tool) {
		
		System.out.println("We would like for you to fix a Pipe" );
	
		
		return true;
	}

}
