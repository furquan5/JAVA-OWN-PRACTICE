package test;
public class CClass extends PClass {
	public static int b;
	public static void m2() {
		System.out.println("======CClass m()======");
		System.out.println("The value b:"+b);
	}
	static {
		System.out.println("CClass static block");
	}

}
