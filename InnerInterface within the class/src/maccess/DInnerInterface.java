package maccess;
import test.*;
public class DInnerInterface {
	public static void main(String[] args) {
		SubClass1.ITest1 ob1=new SubClass1.ITest1() {
			public void m1(int x) {
				System.out.println("===m1()===");
				System.out.println("The value x:"+x);
				
			}
		};
		ITest11.ITest2 ob2=new ITest11.ITest2() {
			public void m2(int y) {
				System.out.println("====m2()====");
				System.out.println("The value y:"+y);
				
			}
		};
		AClass.ITest3 ob3=new AClass.ITest3() {
			public void m3(int z) {
				System.out.println("====m3()=====");
				System.out.println("The value z:"+z);
				
			}
		};
		ob1.m1(297846);
		ob2.m2(8255);
		ob3.m3(78796);
	}

}
