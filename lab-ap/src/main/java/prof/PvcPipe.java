package prof;

public class PvcPipe extends Pipe{
	
	private String color;

	public PvcPipe() {
		super();
		this.color = color;
	}

	public PvcPipe(String color) {
		super();
		this.color = color;
	}


	@Override
	public void updateDamage(float cost) {
	      System.out.println("The cost of fixing this is: " + cost);
		
	}

}
