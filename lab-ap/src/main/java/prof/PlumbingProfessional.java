package prof;

public class PlumbingProfessional extends Professional  

implements IPlumbingProfessional

{

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
		// TODO Auto-generated method stub
		return false;
	}

}
