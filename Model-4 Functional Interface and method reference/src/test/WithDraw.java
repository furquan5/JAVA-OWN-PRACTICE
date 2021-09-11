package test;
public class WithDraw {
	public static void wDraw(double amt) {
		if(amt<=Transaction.b.bal) {
			System.out.println("Withdrawn amt:"+amt);
			Transaction.b.bal=Transaction.b.bal-amt;
			Transaction.b.getBal();
			System.out.println("Transaction completed");
		}
		else {
			System.out.println("Insufficient fund");
		}
	}

}
