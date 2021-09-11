package test;

public class Deposit {
	public Balance b; //Non-primitive data type Instance variable
	public Deposit(Balance b) {
		this.b=b;
		
	}
	public void Deposit(int amt) {
		System.out.println("Amount Deposited:"+amt);
		b.bal=b.bal+amt;
		b.getBalance();
		System.out.println("Transaction Completed...");
	}

}
