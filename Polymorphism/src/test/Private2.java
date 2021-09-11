package test;
public class Private2 {
	private int a=100;
	private void m1() {
		System.out.println("=======Private method m1()=======");
		System.out.println("The value of a is :"+a);
	}
	public void m2() {
		this.m1();
	}

}
