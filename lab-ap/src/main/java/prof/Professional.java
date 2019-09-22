package prof;

import java.awt.List;
import java.util.ArrayList;

public abstract class Professional 
{
    
	private int id;
	private String name;
	private float salary;
	
	 ArrayList<Certification> certification = new ArrayList<Certification>();
	
	public Professional(String name) {
		super();
		this.name = name;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Professional [id=" + id + ", name=" + name + ", salary=" + salary + ", certification=" + certification
				+ "]";
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public ArrayList<Certification> getCertification() {
		
		return certification;
	}

   
	

	public abstract void addCertification(Certification cert);
	
	
	
}
