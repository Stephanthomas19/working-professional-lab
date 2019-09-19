package prof;

public class NetworkingProfessional extends Professional

implements INetworkingProfessional

{
	public NetworkingProfessional () 
	{
		super(null);
	}

	public NetworkingProfessional(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCertification(Certification cert) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean fixRouter(Router router, Tool tool) {
		// TODO Auto-generated method stub
		return false;
	}

}
