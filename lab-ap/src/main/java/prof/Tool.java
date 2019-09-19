package prof;

public abstract class Tool {

	private String Brand;
    
	public Tool() {
		Brand = "";
	}
	public Tool(String brand) {
		super();
		Brand = brand;
	}
   
	public abstract boolean fix(BreakableItem bi);
}
