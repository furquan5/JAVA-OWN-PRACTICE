package test;
public class PTest2 {
	private static PTest2 ob=null;
	private PTest2() {}
	public static PTest2 getRef() {
		if (ob==null)
		{
			ob=new PTest2(); //Constructor call
		}
		return ob;
	}
	public void dis(int z) {
		System.out.println("=====dis()=====");
		System.out.println("The value of z is :"+z);
	}

}
