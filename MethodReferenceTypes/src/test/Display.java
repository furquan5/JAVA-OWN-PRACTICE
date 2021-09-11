package test;
public class Display {
	public Display(int x) {
		System.out.println("=====Constructor body=======");
		System.out.println("The value of x:"+x);
	}
	public void m1(int y) {
		System.out.println("======Instance method=====");
		System.out.println("The value of y:"+y);
	}
	public static void m2(int z) {
		System.out.println("==========Static method m2()=========");
		System.out.println("The value z:"+z);
	}

}
