package test;

public class IClass implements ITest1,ITest2 {
	public void dis() {
		System.out.println("ITest1 val a:"+ITest1.a);
		System.out.println("ITest2 val  a:"+ITest2.a);
		
	}
	public void m1(int x) {
		System.out.println("=======ITest1 m1()====");
		System.out.println("The value x:"+x);
	}
	public void m2(int y) {
		System.out.println("======Itest2 m2()=======");
		System.out.println("The value y:"+y);
	}
	public void m(int k) {
		System.out.println("=====ITest1 ITest2 m()====");
		System.out.println("The value k:"+k);
	}
	

}
