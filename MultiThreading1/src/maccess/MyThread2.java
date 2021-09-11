package maccess;
public class MyThread2 implements Runnable{
	public void run() {
		for(int i=100;i<105;i++) {
			System.out.println("Task 2 :"+i);
			try {
				Thread.sleep(4000);
			}catch(Exception e) {e.printStackTrace();}
		}
	}
}
