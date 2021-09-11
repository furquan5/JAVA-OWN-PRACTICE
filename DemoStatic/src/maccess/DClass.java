package maccess;
import java.util.Scanner;
import static java.lang.Math.*;
public class DClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of the number");
		double val=s.nextDouble();
		double z=sqrt(val);
		System.out.println("Square root of"+ val+ "is"+ z);
		s.close();

	}

}
