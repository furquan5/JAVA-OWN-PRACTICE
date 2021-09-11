package test;
public class SubClass11 {
	public int a=10;
	public static int b=20;
	public static SubClass11 x; //Outer Class Object Reference
	public static class SubClass22{
		public void m1() {
			System.out.println("=====m1=====");
			System.out.println("The value of a:"+x.a);
			System.out.println("The value of b:"+b);
		}
		public static void m2() {
			System.out.println("======m2()======");
			System.out.println("The value of a:"+x.a);
			System.out.println("The value b "+b);
		}
		
	}//innner class
}//outer class
