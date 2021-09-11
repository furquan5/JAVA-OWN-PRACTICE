package macccess;
import java.util.*;
public class DPoly6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value 1");
		int v1=s.nextInt();
		System.out.println("Enter the value 2");
		int v2=s.nextInt();
		System.out.println("Greater Result :"+Result.getResult().compareTo(v1, v2));
		s.close();
	}

}
