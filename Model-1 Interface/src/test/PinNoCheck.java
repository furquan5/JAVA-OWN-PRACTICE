package test;
public class PinNoCheck extends Exception
{
	public PinNoCheck() {}
	public PinNoCheck(String msg) {
		super(msg);
	}
	public void verify(int pinNo) throws PinNoCheck
	{
		try {
			switch(pinNo) {
			case 1111: 
			break;
			case 2222: 
			break;
			case 3333: 
			break;
			case 4444: 
			break;
			default:
				PinNoCheck pnc=new PinNoCheck("Invalid pin number....");
				throw pnc;
				
			}//end of switch
		}//end of try
		catch(PinNoCheck ob) {
			throw ob;
		}
		

	}

}
