package maccess;
import test.*;
public class DemoAClass3 {
	public static void main(String[] args) {
		AClass ob=new AClass() {
			public void m1(int x) {
				System.out.println("=======AClass m1()======");
				System.out.println("The value x is :"+x);
			}
			public void m3(int z) {
				System.out.println("=======m()======");
				System.out.println("The value z:"+z);
			}
			
		};
		ob.m1(157);
		ob.m2(1258);
		//ob.m3(558); //compilation error

	}

}
