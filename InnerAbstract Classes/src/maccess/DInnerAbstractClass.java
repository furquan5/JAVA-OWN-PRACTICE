package maccess;
import test.*;
import java.util.*;
public class DInnerAbstractClass {
	public static void main(String[] args) {
		SubClass1.AClass1 ob1=new SubClass1.AClass1() {
						@Override
			public void m1(int x) {
				System.out.println("=======m1()=======");
				System.out.println("The value x:"+x);
				
			}
		};
		ITest1.AClass2 ob2=new ITest1.AClass2() {
			@Override
			public void m2(int y) {
				System.out.println("=====m2()======");
				System.out.println("The value y:"+y);
				
			}
		};
		AClass1.AClass3 ob3=new AClass1.AClass3() {
			@Override
			public void m3(int z) {
				System.out.println("======m3()======");
				System.out.println("The value z:"+z);
				
			}
		};
		ob1.m1(465);
		ob2.m2(7863);
		ob3.m3(4563);

	}

}
