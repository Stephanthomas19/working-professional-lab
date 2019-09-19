package prof;

public abstract class Router  implements BreakableItem {
 
	private String brand;
    private float bandwidth;
    
    public Router()
    {
    	brand = "";
    	bandwidth = 0.0f;
    }
    
	public Router(String brand, float bandwidth)
	{
		super();
		this.brand = brand;
		this.bandwidth = bandwidth;
	}

	@Override
	public abstract void updateDamage(float cost);
  
    
    
}
