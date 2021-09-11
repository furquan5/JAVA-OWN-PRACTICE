package maccess;
import java.util.*;
public class DException8{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

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
		
	}
}