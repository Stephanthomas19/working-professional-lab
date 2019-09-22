package prof;

public final class CiscoRouter extends Router{
 
	private int ciscoCode;
	
	public CiscoRouter()
	{
		ciscoCode = 0;
	}
	
	
	public CiscoRouter(int ciscoCode) 
	{
		super();
		this.ciscoCode = ciscoCode;
	}

	@Override
	public void updateDamage(float cost) 
	{
		System.out.println("The cost of reparing the damage was updated to: " +cost);
		
	}

}
