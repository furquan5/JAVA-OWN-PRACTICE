package maccess;
import test.*;
public class Inheritance4 {
	public static void main(String[] args) {
		// Normal Inheritence
		System.out.println("==============Display ob1==============");
		CClass ob1=new CClass();
		ob1.m1(121);
		ob1.m2(122);
		ob1.m3(123);
		
		//generaliazation process
		PClass ob2=new CClass();
		System.out.println("===========Display ob2===========");
		ob2.m1(201);
		ob2.m2(202);
		//ob2.m3(203);
		
		

	}

}
