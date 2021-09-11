package test;
public interface ITest {
	public int k=99;
	public int z=999;
	public static class SubClass2{
		public void m2() {
			System.out.println("======m2()=====");
			System.out.println("The value of k:"+k);
			System.out.println("The value of z:"+z);
		}
	}//Inner Class
}//Outer Class
