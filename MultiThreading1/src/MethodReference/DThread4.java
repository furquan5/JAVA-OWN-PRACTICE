package MethodReference;
public class DThread4 {
	public static void main(String[] args) {
		Thread t1=new Thread(MyThread1 ::m1);
		Thread t2=new Thread(MyThread2 ::m2);
		
		t1.start();
		t2.start();

	}

}
