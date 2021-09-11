package maccess;
import java.util.*;
public class DException6 {
	public static void main(String[] args) {
	
			Scanner s=null;
			System.out.println("Enter the value x");
			int x=s.nextInt();//Null Pointer Exception is Raised
			System.out.println("The value x:"+x);
			s.close();
			
			
		

	}

}
