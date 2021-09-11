package maccess;
public class DString2 {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		
		String s3=new String("java");
		String s4=new String("java");
		
		
		System.out.println("========Using String Literal Process==========");
		if(s1==s2) {
			System.out.println("Strings are equal...");
		}
		else {
			System.out.println("Strings are not equal....");
		}
		System.out.println("=======Using New Operator Process=========");
		
		if(s3==s4) {
			System.out.println("Strings are equal...");
		}
		else {
			System.out.println("Strings are not equal...");
		}
		
	}

}
