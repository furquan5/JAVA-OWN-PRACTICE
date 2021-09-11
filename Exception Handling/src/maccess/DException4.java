package maccess;
public class DException4 {
	public static void main(String[] args) {
		try {
			for(int i=1;i<=10;i++) {
				Thread.sleep(2000);
				System.out.println(i);
			}

			
		}catch(Exception e) {e.printStackTrace();}
		
	}

}
