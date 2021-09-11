package maccess;
import test.*;
import java.util.*;
public class MInterface4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value x");
		int x=s.nextInt();
		System.out.println("Enter the value of y");
		int y=s.nextInt();
		System.out.println("=====choice=====");
		System.out.println("1.Greater\n2.Smaller");
		System.out.println("Enter your choioce");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			IComparable gt=new Greater();
			System.out.println("Greater of the two number is:"+gt.CompareTo(x, y));
			break;
			
		case 2:
			IComparable sl=new Smaller();
			System.out.println("Smaller of the two number is:"+sl.CompareTo(x, y));
			break;
		default:
			System.out.println("Inavlid choice=======");
			
			
		}
		s.close();
	}

}
