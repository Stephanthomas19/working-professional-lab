import java.util.ArrayList;
import java.util.Scanner;

import prof.*;



public class Driver {

	
	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in);
		ArrayList<Tool> tools = new ArrayList<Tool>();	
		
		Pliers ply1 = new Pliers("green");
		Pliers ply2 = new Pliers("red");
		Wrench wrench1 = new Wrench(9);
		Wrench wrench2 = new Wrench(5);
		Wrench wrench3 = new Wrench(3);
		
		tools.add(ply1);
		tools.add(ply2);
		tools.add(wrench1);
		tools.add(wrench2);
		tools.add(wrench3);
		
		int term=0;
		
		do {
		
		System.out.println("What kind of professional are you");
		String profType = scan.nextLine();
		
		String plumber = "plumbing professional";
		
		String networkingProf = "networking professional";
		
		if(profType.compareToIgnoreCase(plumber)==0) {
			
			PlumbingProfessional prof = new PlumbingProfessional();
			PvcPipe item = new PvcPipe();
			
			personalDetails(prof);
			prof.fixPipe(item, wrench1);
			item.updateDamage(56);
			
		    	
		}else if(profType.compareToIgnoreCase(networkingProf)==0){
			
			NetworkingProfessional prof = new NetworkingProfessional(); 
			CiscoRouter breakable = new CiscoRouter();
			
			personalDetails(prof);
			prof.fixRouter(breakable, ply1);
			breakable.updateDamage(3443.5f);
			System.out.println("Amazing work");
		
		}else {
			
			System.out.println("Incorrect Profession Entered");
			term = 1;
		}
		
		}while(term==1);
	}

	public static void personalDetails(Professional prof) {
		Scanner scanner = new Scanner(System.in);
		Certification cert = new Certification();
		
		System.out.println("Enter your name ");
		
		String name = scanner.nextLine();
		prof.setName(name);
		
		System.out.println("Enter your ID");
		int id = scanner.nextInt();
		prof.setId(id);
		
	    
		System.out.println("Ennter your Salary");
		float salary = scanner.nextFloat();
		prof.setSalary(salary);
		
		
		System.out.println("How many certs do u have");
		int numCert = scanner.nextInt();
		cert.setNumber(numCert);
		
		
		System.out.println("Name one of your certificate");
		String certName = scanner.next();
		cert.setName(certName);
		prof.addCertification(cert);
			     	
	}
}
