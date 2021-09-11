package test;

public class WithDraw {
	public Balance b;
	public WithDraw(Balance b) {
		this.b=b;
	}
	public void wDraw(int amt) {
		if (amt<=b.bal){
			System.out.println("Amount withdrwan:"+amt);
			b.bal=b.bal-amt;
			b.getBalance();
			System.out.println("Transaction completed ......");
			
		}// end of if 
		else {
			System.out.println("Insufficient funds...");
		}// end of else
	}

}
