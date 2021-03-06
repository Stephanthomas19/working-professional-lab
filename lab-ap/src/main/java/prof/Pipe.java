package prof;

public abstract class Pipe implements BreakableItem {

	protected float length;
	protected float diameter;
	
	public Pipe() {
		length = 0.0f;
		diameter = 0.0f;
	}
	
	public Pipe(float length, float diameter) {
		this.length = length;
		this.diameter = diameter;
	}

	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getDiameter() {
		return diameter;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	@Override
	public abstract void updateDamage(float cost);
	
}
