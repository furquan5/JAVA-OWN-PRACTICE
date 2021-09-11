package test;
public class Deposit {
	public static void deposit(double amt) {
		System.out.println("Amount deposit:"+amt);
		Transaction.b.bal=Transaction.b.bal+amt;
		Transaction.b.getBal();
		System.out.println("Deposited successfully");
	}
}
