package test;
public interface ITest {
	private void m(int k) {
		System.out.println("=====ITest private m()======");
		System.out.println("The value of k:"+k);
	}
	private static void m1(int z) {
		System.out.println("======ITest private static m()=======");
		System.out.println("The value z:"+z);
	}
	default void dis(int k,int z) {
		this.m(k);
		ITest.m1(z);
		
	}
	
}
