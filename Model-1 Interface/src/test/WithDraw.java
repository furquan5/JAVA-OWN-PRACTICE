package test;
public class WithDraw implements Transaction extends Exception
{
	public WithDraw() {}
	public WithDraw(String msg) {
		super(msg);
	}
	public void process(double amt) throws WithDraw
	{
		try {
			if(amt%100==0 && amt<b.bal) {
			System.out.println("Amount withdrawn is:"+amt);
			b.bal=b.bal-amt;
			b.getBal();
			System.out.println("Transaction Completed...");
			
			
		}
		WithDraw wd=new WithDraw("invalid Transaction..");
		throw wd;
		
		
	}//end of try
		catch(WithDraw ob) {
		throw ob;
		}
	}
}
