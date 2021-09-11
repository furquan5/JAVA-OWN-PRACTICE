package maccess;
import java.util.*;
public class DPalindromeAssg {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string..");
		String str=s.nextLine();
		
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		String rev=sb.toString();
		if(str.equals(rev)) {
			System.out.println("String is a Palindrome ..");
		}
		else {
			System.out.println("String is not a palindrome..");
		}
		
	}

}
