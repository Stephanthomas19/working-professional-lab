package prof;

import java.awt.List;
import java.util.ArrayList;

public abstract class Professional 
{
    
	private int integer;
	private String name;
	private float salary;
	
	private ArrayList<Certification> certification = new ArrayList<Certification>();
	
	public Professional(String name) {
		super();
		this.name = name;
	}
	
	public abstract void addCertification(Certification cert);
	
	
}
