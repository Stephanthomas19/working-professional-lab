package prof;

public class Pliers extends Tool {
	
	private String colour;
	
	public Pliers()
	{
		super(null);
		colour = "";
	}
	
	public Pliers(String colour) {
		this.colour =colour;
	}


	@Override
	public boolean fix(BreakableItem bi) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	
		
}
