package maccess;
import test.*;
import java.util.*;
public class DModel4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=0;
		xyz:
		while(true) {
			System.out.println("Enter the pin number");
			int pinNo=s.nextInt();
			PinNoCheck pnc=new PinNoCheck();
			boolean z=pnc.verify(pinNo);
			if(z) {
				System.out.println("=======Choice=======");
				System.out.println("1.Withdraw\n2.Deposit");
				System.out.println("Enter your choice");
				int choice=s.nextInt();
				switch(choice) {
				case 1: // withdraw
					System.out.println("Enter the amount you want to withdraw");
					int a1=s.nextInt();
					if(a1>0 && a1%100==0) {
						Transaction ob1=WithDraw::wDraw; //Method Reference
						ob1.process(a1); //method of withdraw
						
					}
					else {
						System.out.println("Inavlid amount");
					}
					break xyz; //stop while loop
					
				case 2: //Deposit 
					System.out.println("Enter the amount to deposit");
					int a2=s.nextInt();
					if(a2>0 && a2%100==0) {
						Transaction ob2=Deposit::deposit;//Method Reference
						ob2.process(a2);//method of deposit
					}
					else {
						System.out.println("Inavlid amount ");
						
					}
					break xyz; //stop while loop
					default:
						System.out.println("Invalid choice");
						break xyz; //stop while loop
				}//end of switch
				
				
			}//end of if
			else {
				System.out.println("Invalid pin number");
				count++;
				
			}
			if(count==3) {
				System.out.println("Sorry Transaction blocked");
				break xyz; //stop while loop
			}
			
		}//end of while 
		s.close();
		

	}

}
