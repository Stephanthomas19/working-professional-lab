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
		certification.add(cert);
	}

    
	@Override
	public String toString() {
		return "NetworkingProfessional [getId()=" + getId() + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", getSalary()=" + getSalary() + ", getCertification()=" + getCertification()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public boolean fixRouter(Router router, Tool tool) {
		
		return true;
	}

}
