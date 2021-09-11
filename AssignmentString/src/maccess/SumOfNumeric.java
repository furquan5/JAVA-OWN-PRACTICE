package maccess;
import java.util.*;
public class SumOfNumeric {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string with numeric value in it..");
		String str=s.nextLine();
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i)))
			{
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
			
		}
		System.out.println("Sum of numeric value is :"+sum);
		s.close();
	}

}
