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
   
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	
	public abstract boolean fix(BreakableItem bi);
}
