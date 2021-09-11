package maccess;
import test.*;
public class MInnerclass2 {
	public static void main(String[] args) {
		SubClass11 ob1=new SubClass11(); //OuterClass object
		SubClass11.x=ob1;
		SubClass11.SubClass22 ob2=new SubClass11.SubClass22(); //Inner class object 
		ob2.m1();
		SubClass11.SubClass22.m2();

	}

}
