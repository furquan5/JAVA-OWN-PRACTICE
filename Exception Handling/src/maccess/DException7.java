package maccess;
import java.util.*;
public class DException7 {
	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in);)//Java7
		{
			try
			{
				System.out.println("Enter the value:");
				int x = s.nextInt();//Exception for non integer values
				int k = 44/x;//Exception when x=0
				System.out.println("The value k:"+k);
			}//end of try
			catch(InputMismatchException | ArithmeticException
					ob)//Java7
			{
				System.out.println("Enter Only NonZero integer values");
				System.out.println("Details:"+ob.getMessage());
				System.out.println("ClassName:"+ob.getClass());
			}
		}//end of
	}
}