package maccess;
import test.PClass;
public class Inheritance5 {
	public static void main(String args[]) {
		PClass ob2=new PClass()
		{
			public void m1(int x) {
				System.out.println("======void m1()======");
				System.out.println("The value x:"+x);
			}
			public void m3(int z) {
				System.out.println("==========void m3()==========");
				System.out.println("The value z:"+z);
			}
	
		};
		System.out.println("============Display ob2=============");
		ob2.m1(121);
		ob2.m2(122);
//		ob.m3(123);
	}
		
	}
