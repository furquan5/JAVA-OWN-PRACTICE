package maccess;
import test.*;
import java.util.Scanner;
public class Inheritance11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("===========Choice=============");
		System.out.println("1.Student \n2.Employee");
		System.out.println("Enter a choice");
		int choice=Integer.parseInt(s.nextLine());
		switch(choice) {
		case 1: //Student
			Student st=new Student();
			System.out.println("Enter student name :");
			st.stuName =s.nextLine();
			System.out.println("Enter Registration number :");
			st.regNo=s.nextLine();
			System.out.println("Enter Course Name :");
			st.course =s.nextLine();
			System.out.println("Enter House no:");
			st.hNo=s.nextLine();
			System.out.println("Enter the City name:");
			st.city=s.nextLine();
			System.out.println("Enter Street name:");
			st.sName=s.nextLine();
			System.out.println("Enter  pincode:");
			st.pinCode=Integer.parseInt(s.nextLine());
			st.getAddress();
			st.getStudent();
			break;
		case 2: //Employee
			Employee em=new Employee();
			System.out.println("Enter the Employee name");
			em.eName=s.nextLine();
			System.out.println("Enter Employee number");
			em.eNo=s.nextLine();
			System.out.println("Enter employee Designation");
			em.desg=s.nextLine();
			System.out.println("Enter house number");
			em.hNo=s.nextLine();
			System.out.println("Enter street name ");
			em.sName=s.nextLine();
			System.out.println("Enter the city name ");
			em.city=s.nextLine();
			System.out.println("Enter the pincode");
			em.pinCode=Integer.parseInt(s.nextLine());
			em.getAddress();
			em.getEmployee();
			break;
		default:
			System.out.println("Invalid Choice======");
		}//end of switch
		s.close();
	}

}
