package maccess;
import test.*;
public class MInnerClass1 {
	public static void main(String[] args) {
		SubClass1 ob1=new SubClass1();
		ob1.m1();
		SubClass1.SubClass2 ob2=ob1.new SubClass2();
		ob2.m2();
	}

}
