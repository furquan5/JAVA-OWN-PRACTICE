package maccess;
import java.util.*;

import test.IComparable;
public class MInterface6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int v1=s.nextInt();
		System.out.println("Enter the value of y:");
		int v2=s.nextInt();
		System.out.println("========choice======");
		System.out.println("1.Greater\n2.Smaller");
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		switch(choice) {
		case 1: //Greater
			IComparable gt=(int x, int y)->{
				if(x>y) return x;
				else return y;
				
			};
			System.out.println("The greater value  is:"+gt.CompareTo(v1, v2));
			break;
		case 2://Smaller
			IComparable sm=(int x, int y) -> {
				if(x<y) return x;
				else return y;
				
			};
			System.out.println("The smaller value is:"+sm.CompareTo(v1, v2));
			break;
			default:
				System.out.println("Inavlid choice.....");
				s.close();
		}

	}

}
