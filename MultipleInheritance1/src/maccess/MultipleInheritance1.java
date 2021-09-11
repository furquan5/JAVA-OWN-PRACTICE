package maccess;
import test.*;
public class MultipleInheritance1 {

	public static void main(String[] args) {
		IClass ob=new IClass();
		ob.dis();
		ob.m1(521);
		ob.m2(548);
		ob.m(1972);
		ITest1.process(444);;
		ITest2.process2(555);
		ob.m3(666);
		ob.m4(777);
	}
	

}
