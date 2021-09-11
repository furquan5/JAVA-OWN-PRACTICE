package maccess;
public class CheckBranch extends Exception
{
	public CheckBranch() {}
	public CheckBranch(String msg) {
		super(msg);
	}
	public void verify(String br) throws CheckBranch {
		try{
			switch(br){
		
			case "CSE": 
			break;
			case "ECE":
			break;
			case "EEE": 
			break;
			default: //RaiseException
				CheckBranch ob=new CheckBranch("Invalid input....");
				throw ob;
			}//end of switch
	
	}//end of try
		catch(CheckBranch ob) {
			throw ob; //rethrowing exception
		}
}
}
	
	

