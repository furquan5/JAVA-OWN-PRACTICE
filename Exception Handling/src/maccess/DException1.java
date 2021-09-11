package maccess;
import java.util.*;
public class DException1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter a value :");
			int x=s.nextInt(); //Exception for non-integer values 
			int k=44/x; //Exception when x=0
			System.out.println("The value of k:"+k);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter only Integers");
			System.out.println("Details:"+ime.getMessage());
			System.out.println("Class Name:"+ime.getClass());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Enter NonZero numbers only");
			System.out.println("Details:"+ae.getMessage());
			System.out.println("Class Name:"+ae.getClass());
		}
		finally
		{
			s.close();
		}

	}

}
