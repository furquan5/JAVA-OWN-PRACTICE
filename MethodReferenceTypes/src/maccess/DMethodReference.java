package maccess;
import test.*;
public class DMethodReference {

	public static void main(String[] args) {
		ITest ob1=Display::new; //Reference to constructor 
		ob1.dis(549); //Constructor body is executed
		Display d=new Display(699); //Constructor call
		ITest ob2=d::m1; //Reference to Instance method
		ob2.dis(112); //Instance method body is executed
		ITest ob3=Display::m2;//Reference to static method 
		ob3.dis(113); //static method body is executed 
		

	}

}
