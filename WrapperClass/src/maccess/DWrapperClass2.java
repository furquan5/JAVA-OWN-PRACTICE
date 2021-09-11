package maccess;
public class DWrapperClass2 {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Double d1=new Double(9223372036.854775807); //Contructor to call double data
		Double d2=new Double("87576.4967598509");  //Constructor to call double data in the form of string
		
		
		System.out.println("=========Display Long=========");
		System.out.println("d1 :"+d1.toString());
		System.out.println("d2 :"+d2.toString());

	}

}
