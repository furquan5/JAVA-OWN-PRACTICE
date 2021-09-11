package maccess;
import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		
		char[] c=str.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print	(c[i]);
		}
	}

}
