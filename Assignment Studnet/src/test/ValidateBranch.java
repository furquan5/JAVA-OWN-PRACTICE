package test;
public class ValidateBranch extends Exception
{
	public ValidateBranch(){}
	public ValidateBranch(String msg){
		super(msg);
	}
	public String branch=null;
	public void verify(String br,String code)throws
	ValidateBranch
	{
		try{
			switch(code)
			{
			case "05":branch = "CSE";

			break;

			case "02":branch = "EEE";

			break;

			case "04": branch="ECE";

			break;
			}//end of switch
			if(branch!=null)//Simple if
			{
				if(!br.equals(branch))//raise the exception
				{
					ValidateBranch vb =
							new ValidateBranch("RollNo Not Matched with Branch");

					throw vb;
				}//end of if
			}//end of if
			else{
				ValidateBranch vb =
						new ValidateBranch("RollNo Not Matched with Branch");
				throw vb;
			}

		}//end of try
		catch(ValidateBranch vb){
			throw vb;
		}
	}
}