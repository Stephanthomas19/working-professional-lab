package prof;

public class Wrench extends Tool{
	
	private float size;
	
	public Wrench()
	{
		size = 0.0f;
	}
	
	
	public Wrench(float size) {
		super();
		this.size = size;
	}


	public Wrench(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean fix(BreakableItem bi) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Wrench [size=" + size + "]";
	}

	
	
	
}
