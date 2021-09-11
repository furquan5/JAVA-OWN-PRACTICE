package maccess;
public class UnBoxingProcess {
	public static void main(String[] args) {
		Integer ob1=new Integer(12);
		Float ob2=new Float(567.6f);
		Character ob3=new Character('a');
		Boolean ob4=new Boolean(true);
		
		int i=ob1.intValue();
		float f=ob2.floatValue();
		char ch=ob3.charValue();
		boolean b=ob4.booleanValue();
		
		System.out.println("=====Display========");
		System.out.println("i  :"+i);
		System.out.println("f   :"+f);
		System.out.println("ch  :"+ch);
		System.out.println("b  :"+b);


	}

}
