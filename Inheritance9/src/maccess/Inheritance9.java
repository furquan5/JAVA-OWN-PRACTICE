package maccess;
import test.*;
import java.util.Scanner;
public class Inheritance9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value 1 ");
		int v1=s.nextInt();
		System.out.println("Enter the value 2");
		int v2=s.nextInt();
		System.out.println("Enter the value 3");
		int v3=s.nextInt();
		System.out.println("Enter the value 4");
		int v4=s.nextInt();
		
		CClass ob=new CClass();
		ob.setData(v1, v2, v3, v4);
	}

}
