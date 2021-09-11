package test;
public class Deposit implements Transaction{
	public void process(double amt) {
		System.out.println("Amt deposited :"+amt);
		b.bal=b.bal+amt;
		System.out.println("total amount:"+b.bal);
		
	}

}
