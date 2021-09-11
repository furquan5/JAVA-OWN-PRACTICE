package test;
public abstract class AClass {
	public static int f=100;
	public static class subclass222{
		public void m222() {
			System.out.println("======m222()======");
			System.out.println("The value f:"+f);
		}
	}//InnerClass
}//OuterClass
