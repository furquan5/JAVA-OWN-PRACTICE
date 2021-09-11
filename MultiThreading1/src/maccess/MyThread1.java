package maccess;
public class MyThread1 implements Runnable  //Step-1
{
	public void run() //Step-2
	{
		for(int i=0;i<5;i++) {
			System.out.println("Task 1 :"+ i);
			try {
				Thread.sleep(4000);
			}catch(Exception e) {e.printStackTrace();}
		}//end of for
	}
	
}
