package macess;
import java.util.Scanner;
import test.*;


public class DRef2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		Balance b=new Balance();
		int count=0;
		xyz:
			while(true) {
				System.out.println("Enter the pin number");
				int pinNo=s.nextInt();
				PinCheck pc=new PinCheck();
				boolean z=pc.verify(pinNo);
				if(z) {
					System.out.println("=======choice=========");
					System.out.println("1.WithDraw \n2.Deposit");
					System.out.println("ENter the choice");
					int choice=s.nextInt();
					switch(choice) {
					case 1:
						System.out.println("ENter the amount");
						int a1=s.nextInt();
						if(a1>0 &&a1%100==0) {
							WithDraw wd=new WithDraw(b);
							wd.wDraw(a1);
							
						}
						else {
							System.out.println("Invalid amount");
						}
						break xyz;
						
					case 2:
						System.out.println("ENter the amt:");
						int a2=s.nextInt();
						if(a2>0 &&a2%199==0) {
							Deposit dp=new Deposit(b);
							dp.Deposit(a2);
						}
						else {
							System.out.println("Invalid amount");
						}
						break xyz;
					default:
						System.out.println("Inavlid Choice ..");
						break xyz;
					}
				}
				else {
					System.out.println("Inavlid pin number");
					count++;
				}
				if(count==3) {
					System.out.println("Sorry ! Transcation failed...");
					break xyz;
				}
			}
		s.close();
		
	}

}
