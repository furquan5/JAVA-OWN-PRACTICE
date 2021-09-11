package maccess;
public class DThread2 {
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for (int i=0;i<5;i++) {
					System.out.println("Task 1:"+i);
					try {
						Thread.sleep(2000);
					}catch(Exception e) {e.printStackTrace();}
			}
		}
		
		
	});
	Thread t2=new Thread(new Runnable() {
		public void run() {
			for(int i=200;i<205;i++) {
				System.out.println("Task 2 :"+i);
				try {
					Thread.sleep(2000);
				}catch(Exception e) {e.printStackTrace();}
			}
		}
	});
	
	t1.start();
	t2.start();
	}

}
