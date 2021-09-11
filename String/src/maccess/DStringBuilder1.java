package maccess;
public class DStringBuilder1 {
	public static void main(String[] args) {
		System.out.println("=====sb======");
		StringBuilder sb=new StringBuilder("Furquan");
		System.out.println("Default Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		sb.append("Arshi kishanagnaj");
		System.out.println(sb.toString());
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		
		StringBuilder sb2=new StringBuilder(sb);
		System.out.println("Default Capacity :"+sb2.capacity());
		System.out.println("Length :"+sb2.length());
		sb2.append("Haldia institute od technology");
		System.out.println(sb2.toString());
		System.out.println("Capacity :"+sb2.capacity());
		System.out.println("Length :"+sb2.length());
	}

}
