package macccess;
import java.util.*;
import test.Smaller;
import test.IComparable;
import test.Greater;
public class DPoly1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value 1");
		int v1=s.nextInt();
		System.out.println("Enter value 2");
		int v2=s.nextInt();
		System.out.println("=====Choice========");
		System.out.println("1.Greater \n2.Smaller");
		System.out.println("Enter a choice");
		int choice=s.nextInt();
		switch(choice) {
		case 1: //Greater
			Greater gt=new Greater();
			gt.compareTo(v1, v2);
			System.out.println("The greater number is  :"+gt.compareTo(v1, v2));
			break;
			
		case 2: //Smaller
			
			Smaller sm=new Smaller();
			sm.compareTo(v1, v2);
			System.out.println("The smaller number is :"+sm.compareTo(v1, v2));
			break;
			
		default:
			System.out.println("Invalid choice");
			
		}
		s.close();
		
		
	}

}
