package test;
public class IClass implements ITest2{
	public void m1() {
		System.out.println("======ITest1 m1()=======");
		System.out.println("The value x:"+x);
	}
	public void m2() {
		System.out.println("=====ITest2 m2()=======");
		System.out.println("The value of y:"+y);
	}

}
