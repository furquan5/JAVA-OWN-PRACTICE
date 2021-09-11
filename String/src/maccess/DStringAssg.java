package maccess;
import java.util.*;
public class DStringAssg {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string which you want to reverse");
		String str=s.nextLine();
		char []c=str.toCharArray();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+c[i];
		}
		System.out.println("The reversed string is :"+rev);

	}

}
