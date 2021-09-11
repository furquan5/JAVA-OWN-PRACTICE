package test;
import java.util.*;

public class Read {
	public void read(Scanner s,Employee e) {
		System.out.println("Enter the EId:");
		e.eId=s.nextLine();
		System.out.println("Enter the EName:");
		e.eName=s.nextLine();
		System.out.println("Enter the EDesg:");
		e.eDesg=s.nextLine();
		System.out.println("Enter the HNo:");
		e.ad.hNo=s.nextLine();
		System.out.println("Enter the SName:");
		e.ad.sName=s.nextLine();
		System.out.println("Enter the City:");
		e.ad.city=s.nextLine();
		System.out.println("Enter the PInCode:");
		e.ad.pinCode=s.nextInt();
		
	}

}
