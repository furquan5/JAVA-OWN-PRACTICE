package maccess;
public class DObject2 {
	public static void main(String[] args) {
		User ob1=new User("abz@123","ftj%34");
		System.out.println("=====Original Object=====");
		System.out.println(ob1.toString());
		System.out.println(ob1.hashCode());
		
		
		User ob2=(User)ob1.cloning(); //Step-4
		System.out.println("======Cloned Object=======");
		System.out.println(ob2.toString());
		System.out.println(ob2.hashCode());
	}

}
