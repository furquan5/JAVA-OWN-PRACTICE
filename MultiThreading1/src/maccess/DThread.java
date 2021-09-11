package maccess;
public class DThread {
	public static void main(String[] args) {
		MyThread1 ob1=new MyThread1();
		MyThread2 ob2=new MyThread2();
		
		Thread t1=new Thread(ob1);
		Thread t2=new Thread(ob2);
		
		t1.start();
		t2.start();

	}

}
