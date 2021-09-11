package MethodReference;
public class MyThread1 {
	public static void m1() {
		for(int i=0;i<5;i++) {
			System.out.println("Task1 :"+i);
			try {
				Thread.sleep(3000);
			}catch(InterruptedException ie) {ie.printStackTrace();}
		}
	}

}
