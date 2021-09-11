package maccess;
import java.util.*;
import test.*;
public class MLambda {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value 1");
		int v1=s.nextInt();
		System.out.println("Enter the value 2");
		int v2=s.nextInt();
		System.out.println("=====choice=====");
		System.out.println("1.Greater\n2.Smaller");
		System.out.println("Enter a choice");
		int choice=s.nextInt();
		switch(choice) {
		case 1: //Greater
			Result.getResult(v1,v2,(int x,int y)->
			{
				if(x>y) return x;
				else return y;
			});
			break;
		case 2://Smaller
			Result.getResult(v1, v2, (int x,int y)->
			{
				if(x<y) return x;
				else return y;
			});
			break;
		default:
			System.out.println("Invalid choice........");
		}//end of switch
		s.close();
	}

}
