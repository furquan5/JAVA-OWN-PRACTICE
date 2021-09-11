package maccess;
import test.*;
import java.util.*;
public class DModel3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count =0;
		xyz:
			while(true) {
				System.out.println("Enter the pin number");
				int pinNo=s.nextInt();
				PinNoCheck pnc=new PinNoCheck();
				boolean z=pnc.verify(pinNo);
				if(z) {
					System.out.println("1.WithDraw \n2.Deposit");
					System.out.println("======Enter choice======");
					int choice=s.nextInt();
					switch(choice) {
					case 1: //WithDraw
						System.out.println("Enter the amount to withdraw");
						int a1=s.nextInt();
						if(a1>0 && a1%100==0) {
							Transaction wd=(double amt)-> 
							{
								if(amt<Transaction.b.bal) {
									System.out.println("Amount withdrawn is:"+amt);
									Transaction.b.bal=Transaction.b.bal-amt;
									Transaction.b.getBal();
									System.out.println("Transaction Completed...");
								}else{
									System.out.println("Insufficient funds.");
								}
							};
							wd.process(a1);
						}
							
							else {
								System.out.println("Invalid amount");
							}
							
						
						break xyz; //stop while loop
					case 2: //Deposit
						System.out.println("Enter the amount to deposit:");
						int a2=s.nextInt();
						if(a2>0 &&  a2%100==0) {
							Transaction dp=(double amt)-> {
								System.out.println("Amt deposited :"+amt);
								Transaction.b.bal=Transaction.b.bal+amt;
								Transaction.b.getBal();
								System.out.println("Transaction Completed...");
								
							};
							dp.process(a2);
						}else {
							System.out.println("Invalid amount");
						}
							break xyz; //stop while loop
						default:
							System.out.println("Invalid choice");
							break xyz;//stop while loop
					}//end of switch
				}//end of if 
				else{
					System.out.println("Invalid pin no");
					count+=1;
					
				}
				if(count==3) {
					System.out.println("Sorry ! Transaction blocked for 24 hours !");
					break xyz;//stop while loop
				}
				
				
			}//end of loop
		s.close();
	}

}

