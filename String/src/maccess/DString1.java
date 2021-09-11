package maccess;
public class DString1 {
	public static void main(String args[]) {
		String str="String";
		String str2=new String("String 2");
		
		
		System.out.println("=======Display()========");
		System.out.println("str :"+str.toString()); //Auto-Boxing Process
		System.out.println("str2 :"+str2.toString());//Boxing Process
	}

}
