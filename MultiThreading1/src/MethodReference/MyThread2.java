package MethodReference;
public class MyThread2 {
	public static void m2() {
		for(int i=100;i<105;i++) {
			System.out.println("Task 2:"+i);
			try {
				Thread.sleep(3000);
			}catch(InterruptedException ie) {ie.printStackTrace();}
		}
	}
}
