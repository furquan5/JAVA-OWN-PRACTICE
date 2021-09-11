package maccess;
public class Inheritance13 {
	public static void main(String args[]) {
		Inheritance13.main(12.37f); //method call
		System.out.println("========Standard main method call=======");
		for(String k : args) {
			System.out.println(k);
			
		}
		
	}
	public static void main(float f) {
		System.out.println("=======Overloaded method main()=======");
		System.out.println("The value f:"+f);
	}

}
