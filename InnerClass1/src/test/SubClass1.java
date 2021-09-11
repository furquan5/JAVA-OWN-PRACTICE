package test;
public class SubClass1 {
	public int a=10;
	public static int b=20;
	public void m1() {
		System.out.println("=====m1()=======");
		System.out.println("The value a is :"+a);
		System.out.println("The value b is :"+b);
	}
	public class SubClass2{
		public void m2() {
			System.out.println("========m2()========");
			System.out.println("The value of a is:"+a);
			System.out.println("The value of b is"+b);
		}
		
	}//Inner class

}//Outer class
