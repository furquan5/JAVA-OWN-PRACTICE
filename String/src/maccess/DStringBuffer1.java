package maccess;
public class DStringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("Default Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		sb.append("java");
		System.out.println(sb.toString());
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		sb.append("ProgrammingLanguage");
		System.out.println(sb.toString());
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		System.out.println("======Insert()======");
		sb.insert(4, "kkkkmmmm");
		System.out.println(sb.toString());
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		System.out.println("======To reverse()======");
		sb.reverse();
		System.out.println(sb.toString());
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());

	}

}
