package test;
public class PTest1 {
	private static PTest1 ob=null;
	private PTest1() {}
	static {
		ob=new PTest1(); //Constructor Call
	}
	public static PTest1 getRef() {
		return ob;
	}
	public void dis(int z) {
		System.out.println("=======dis()======");
		System.out.println("The value of z is :"+z);
	}

}
