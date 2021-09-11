package maccess;
import test.Greater;
import test.Smaller;
import java.util.Scanner;
public class MInterface2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value 1");
		int v1=s.nextInt();
		System.out.println("Enter the value 2");
		int v2=s.nextInt();
		System.out.println("===========Choice==========");
		System.out.println("1.Greater\n2.Smaller");
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		
		switch(choice) {
		case 1:
			Greater gt=new Greater();
			System.out.println("Greater value is :"+gt.CompareTo(v1, v2));
			break;
		case 2:
			Smaller sl=new Smaller();
			System.out.println("Smaller value is:"+sl.CompareTo(v1, v2));
			break;
		default:
			System.out.println("Invalid Choice");
		}//end of switch
		s.close();
	}

}
