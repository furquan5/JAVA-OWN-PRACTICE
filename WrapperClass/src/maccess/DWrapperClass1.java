package maccess;
public class DWrapperClass1 {
	public static void main(String[] args) {
		// Boxing Process
		Integer ob1=new Integer(12); //Constructor call with int data
		Integer ob2=new Integer("151");//Constructor call with string data
		
		System.out.println("========Display()=========");
		System.out.println("ob1 :"+ob1.toString());
		System.out.println("ob2 :"+ob2.toString());

	}

}
