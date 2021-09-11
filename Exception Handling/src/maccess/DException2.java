package maccess;
import java.util.*;
public class DException2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter a number");
			int x=s.nextInt();
			int k=44/x;
			System.out.println("The value of k :"+k);
		}
		catch(ArithmeticException |InputMismatchException ob)
		{
			System.out.println("Enter only NonZero numbers:");
			System.out.println("Details:"+ob.getMessage());
			System.out.println("ClassName:"+ob.getClass());
		}
		finally
		{
			s.close();
		}

	}

}
