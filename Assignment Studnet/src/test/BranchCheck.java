package test;
public class BranchCheck extends Exception
{
	public BranchCheck() {}
	public BranchCheck(String msg) {
		super(msg);
	}
	public void verify(String br) throws BranchCheck
	{
		try {
			switch(br){
			case "CSE":
			break;
			case "ECE":
			break;
			case "EEE":
			break;
			default://Exception raise will here
				BranchCheck ob=new BranchCheck("Invalid Branch.....");
				throw ob;
			}//end of switch
			
		}//end of try
		catch(BranchCheck ob) {
			throw ob;
		}
	}
}		
		




