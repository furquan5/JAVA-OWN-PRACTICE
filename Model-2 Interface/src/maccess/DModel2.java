package maccess;
import test.*;
import java.util.*;
public class DModel2{
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
							Transaction wd=new Transaction() {
								public void process(double amt) {
									if(amt<b.bal) {
										System.out.println("Amount withdrawn:"+amt);
										b.bal=b.bal-amt;
										b.getBal();
										System.out.println("Transaction complete..");
									}
									else{
										System.out.println("Insufficient fund");
									}
								}
								};
								wd.process(a1);
							}else {
								System.out.println("Invalid amount..");
							}
						break xyz;

						
						
					case 2: //Deposit
						System.out.println("Enter the amount to deposit:");
						int a2=s.nextInt();
						if(a2>0 &&  a2%100==0) {
							Transaction dp=new Transaction()
							{
								public void process(double amt) {
									System.out.println("Amt deposited :"+amt);
									b.bal=b.bal+amt;
									System.out.println("total amount:"+b.bal);
									
								}

							};
							dp.process(a2);
							

						}
						else {
							System.out.println("Invalid amount...");
							}
						break xyz;
						default:
							System.out.println("Invalid choice...");
							break xyz;
						}
				}//end of if 
				else{
					System.out.println("Invalid pin no");
					count+=1;
					
				}
				if(count==3) {
					System.out.println("Sorry ! Transaction blocked for 24 hours !");
					break xyz;
				}
				
				
			}
		s.close();
	}

}
