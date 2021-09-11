package test;
public class IClass extends PClass implements ITest{
	public void m2(int y) {
		System.out.println("=====ITest m2()======");
		System.out.println("The value y:"+y);
	}

}
