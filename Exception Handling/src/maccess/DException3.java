package maccess;
import java.util.*;
public class DException3 extends Exception //step1
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public DException3 (String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try { //step-2
			System.out.println("Enter the age"); //Exception for non integer value 
			int age=s.nextInt();
			if(age<18) { //step3 condition to raise exception
				DException3 ob=new DException3("Not eligibe for voting ...."); //step4
				throw ob; //step5
				
			}
			System.out.println("age:"+age);
			System.out.println("Eligible for voting...");
			
		}//end of try
		catch(DException3 |InputMismatchException zb) { //step6
			System.out.println("Enter age greater than 18 & enter only integer value");
			System.out.println("Details:"+zb.getMessage());
			System.out.println("Class Name:"+zb.getClass());
		}
		finally { //step7
			s.close();
		}
		

	}

}
