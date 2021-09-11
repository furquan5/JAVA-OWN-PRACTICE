package test;
public interface ITest {
	default void m(int k) {
		System.out.println("=====ITest default m()=====");
		System.out.println("The value of k:"+k);
	}

}
