package test;
public class CClass extends PClass {
	public int a;
	public void m1() {
		System.out.println("=======m1() from CClass====");
		System.out.println("The value x:"+a);
	}
	{
		System.out.println("============CClass Instance block==========");
	}

}
