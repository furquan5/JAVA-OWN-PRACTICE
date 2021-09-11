package test;
public class CClass extends PClass{
	public static void m(int x,int y) {
		System.out.println("======CClass static m(int ,int)========");
		System.out.println("The value x:"+x);
		System.out.println("The value y:"+y);
	}
	public static void m(int x,float y) {
		System.out.println("======CClass static m(int ,float)=======");
		System.out.println("The value x:"+x);
		System.out.println("The value y:"+y);
	}

}
