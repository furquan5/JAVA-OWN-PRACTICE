package maccess;
import test.*;
import java.util.*;
public class SMainClass extends Exception//MainClass
{
	public SMainClass(String msg){
		super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try{
			System.out.println("Enter the StuName:");
			String stuName = s.nextLine();
			System.out.println("Enter the branch:");
			String br = s.nextLine().toUpperCase();
			BranchCheck cb = new BranchCheck();

			cb.verify(br);

			System.out.println("Enter the rollNo:");
			String rollNo = s.nextLine();
			if(rollNo.length()!=10)//raise exception
			{
				SMainClass ob = new SMainClass("Invalid rollNo...");
				throw ob;
			}
			ValidateBranch vb = new ValidateBranch();
			vb.verify(br,rollNo.substring(6,8));
			int totM=0,i=1,p=0;
			System.out.println("====Enter Six Sub Marks===");
			while(i<=6)
			{
				try{
					System.out.println("Enter the Sub"+i);
					int sub = Integer.parseInt(s.nextLine());
					i++;
					if(sub<0 || sub>100)//raise the exception
					{
						SMainClass ob = new SMainClass("Invalid marks..");

						throw ob;
					}

					if(sub>=0 && sub<=34)
					{
						p=1;
					}
					totM = totM+sub;
				}//end of try
				catch(SMainClass ob)
				{
					i--;
					System.out.println(ob.getMessage());
				}
			}//end of loop
			System.out.println("StuName:"+stuName);
			System.out.println("Branch:"+br);
			System.out.println("RollNo:"+rollNo);
			System.out.println("TotalMarks:"+totM);
			test.SResult sr = new test.SResult();
			sr.cal(p,totM);
			sr.getResult();

		}//end of try
		catch(BranchCheck | ValidateBranch | SMainClass ob)
		{
			System.out.println("Details : "+ob.getMessage());
			System.out.println("ClassName:"+ob.getClass());

		}
		finally
		{
			s.close();
		}
	}
}
