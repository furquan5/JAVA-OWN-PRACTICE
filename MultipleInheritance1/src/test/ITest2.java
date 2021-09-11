package test;
public interface ITest2 {
	public static int a=12;
	public abstract void m2(int y);
	public abstract void m(int k);
	public static void process2(int q)
	{
		System.out.println("=====ITest2 process2()======");
		System.out.println("The value of q:"+q);
	}
	public default void m4(int h){
	System.out.println("======ITest1 m4()======");
	System.out.println("The value h:"+h);
	}
	
}
