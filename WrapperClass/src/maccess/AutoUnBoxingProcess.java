package maccess;
public class AutoUnBoxingProcess {
	public static void main(String[] args) {
		Integer ob1=12;
		Float ob2=56.56f;
		Character ob3='a';
		Boolean ob4=true;
		
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
