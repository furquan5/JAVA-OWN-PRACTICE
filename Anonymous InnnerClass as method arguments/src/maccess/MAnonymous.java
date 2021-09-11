package maccess;
import java.util.*;
import test.*;
public class MAnonymous {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value 1");
		int v1=s.nextInt();
		System.out.println("Enter the value 2");
		int v2=s.nextInt();
		System.out.println("=======Choice=====");
		System.out.println("1.Greater\n2.Smaller");
		System.out.println("Enter a choice....");
		int choice=s.nextInt();
		switch(choice) {
		case 1: //Greater
			Result.getResult(v1,v2,new IComparable() {
				public int CompareTo(int x,int y) {
					if(x>y) return x;
			
					else return y;
				}
			});
			
			break;
			
		case 2://Smaller
			Result.getResult(v1,v2, new IComparable() {
				public int CompareTo(int x,int y) {
					if(x<y) return y;
					else return x;
				}
			});
			break;
			
		default:
			System.out.println("Invalid choice......");
		}
		s.close();
	}

}
