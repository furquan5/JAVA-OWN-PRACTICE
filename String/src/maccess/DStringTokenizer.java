package maccess;
import java.util.*;
public class DStringTokenizer {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		
		StringTokenizer st=new StringTokenizer(str,"a");
		System.out.println("Number of Tokens are :"+st.countTokens());
		System.out.println("====Display Tokens()=====");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		s.close();
	}

}
