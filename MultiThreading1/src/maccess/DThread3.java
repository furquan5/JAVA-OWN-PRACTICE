package maccess;
public class DThread3 {
	public static void main(String[] args) {
		Thread t1=new Thread(()->{
			
				for(int i=0;i<5;i++) {
					System.out.println("Task 1 :"+i);
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ie) {ie.printStackTrace();}
				}
			
		});
		
		Thread t2=new Thread(()->{
			
				for(int i=300;i<305;i++) {
					System.out.println("Task 2:"+i);
					try{
						Thread.sleep(2000);
					}catch(InterruptedException ie) {ie.printStackTrace();}
					}
				
		});
		t1.start();
		t2.start();

	}

}
