package maccess;
import java.util.*;
public class DException5 extends Exception
{
	public DException5(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter the student name");
			String sname=s.nextLine();
			System.out.println("Enter student bracnch");
			String br=s.nextLine().toUpperCase();
			CheckBranch cb=new CheckBranch();
			cb.verify(br);//user-defined exception is raised
			System.out.println("Enter the roll no");
			String rollno=s.nextLine();
			if(rollno.length()!=10) {  //Raise Exception
				DException5 de=new DException5("Invalid roll number");
				throw de;
				
			}
			System.out.println("Name "+sname);
			System.out.println("Branch "+br);
			System.out.println("Roll no "+rollno);
		}//end of try
		catch(CheckBranch | DException5 ob) {
			System.out.println("Details"+ob.getMessage());
			System.out.println("ClassName"+ob.getClass());
		}
		finally {
			s.close();
		}
		
		
		
	}

}
