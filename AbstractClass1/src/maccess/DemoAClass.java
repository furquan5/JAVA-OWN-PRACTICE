package maccess;
import test.*;
import java.util.*;
public class DemoAClass {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x");
		double x=s.nextDouble();
		Display d=new Display(x);
		d.cal();
		d.dis();
		s.close();
	}

}
