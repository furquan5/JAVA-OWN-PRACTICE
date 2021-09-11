package maccess;
import java.util.*;
public class DString5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  string1");
		String str1=s.nextLine();
		System.out.println("Enter  string2");
		String str2=s.nextLine();
		System.out.println("Enter  string3");
		String str3=s.nextLine();
		
		String str4=str1.concat(str2);
		String str5=str1.concat(str3);
		String str6=str2.concat(str3);
		String str7=str1+str2+str3;
		
		System.out.println("Str 4 :"+str4.toString());
		System.out.println("Str 5 :"+str5.toString());
		System.out.println("Str 6 :"+str6.toString());
		System.out.println("Str 7:"+str7.toString());

	}

}
