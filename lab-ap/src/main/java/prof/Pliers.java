package prof;

public class Pliers extends Tool {
	
	private String colour;
	
	public Pliers()
	{
		super(null);
		colour = "";
	}
	
	public Pliers(String brand) 
	{
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean fix(BreakableItem bi) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	
		
}
