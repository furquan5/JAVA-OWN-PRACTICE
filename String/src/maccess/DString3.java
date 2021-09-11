package maccess;
import java.util.*;
public class DString3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string 1");
		String s1=s.nextLine().trim();
		System.out.println("Enter string 2");
		String s2=s.nextLine().trim();
		
		System.out.println("=====Display Using Equals method====");
		boolean k=s1.equalsIgnoreCase(s2);
		if(k) {
			System.out.println("Strings are equal.....");
		}else {
			System.out.println("Strings are not equal...");
		}
		
		System.out.println("====Display using compareTo method()====");
		int z=s1.compareToIgnoreCase(s2);
		if(z==0) {
			System.out.println("Strings are equal....");
		}
		else {
			System.out.println("Strings are not equal...");
		}
	}

}
