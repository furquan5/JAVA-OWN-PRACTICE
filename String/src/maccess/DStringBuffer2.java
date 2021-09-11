package maccess;
public class DStringBuffer2 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(6);
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Lenght :"+sb.length());
		sb.append("Furquan");
		System.out.println("Sb :"+sb.toString());
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Lenght :"+sb.length());
		sb.append("ProgrammingLanguage");
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Lenght :"+sb.length());

	}

}
