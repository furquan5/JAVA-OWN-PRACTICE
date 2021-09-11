package maccess;
import java.util.Scanner;
import test.*;

public class DRef1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Employee e=new Employee();
		Read r=new Read();
		r.read(s,e); //method call
		Display d= new Display();
		d.dis(e);
		s.close();

	}

}
