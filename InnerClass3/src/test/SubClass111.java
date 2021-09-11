package test;
public class SubClass111 {
	public int a=10;
	public static int b=20;
	public void m1() {
		class SubClass222{
			public void m2() {
				System.out.println("===Local inner class m2()=====");
				System.out.println("The value of a:"+a);
				System.out.println("The value of b:"+b);
			}//inner method 
			
		}//LocalInnerClass
		SubClass222 ob2=new SubClass222();//Inner class object
		ob2.m2();
	}//outer method 
}//outer Class
