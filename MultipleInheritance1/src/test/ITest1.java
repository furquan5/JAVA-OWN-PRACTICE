package test;
public interface ITest1 {
	public static final int a=10;
	public abstract void m1(int x);
	public abstract void  m(int k);
	public static void process(int p) {
		System.out.println("========ITest1 process()=========");
		System.out.println("The value of p:"+p);
	}
	public default void m3(int g) {
		System.out.println("======ITest1 default void m3()========");
		System.out.println("The value of g:"+g);
	}
}
