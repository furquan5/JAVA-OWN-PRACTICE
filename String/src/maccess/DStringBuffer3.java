package maccess;
public class DStringBuffer3 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Furquan");
		System.out.println("====Display java.lang.StringBuffer(java.lang.String)======");
		System.out.println("DEafult Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		sb.append("programmingLangauage");
		System.out.println(sb.toString());
		System.out.println("Capacity :"+sb.capacity());
		System.out.println("Length :"+sb.length());
		
		StringBuffer sb2=new StringBuffer(sb);
		System.out.println("======Display from java.lang.StringBUffer(java.lang.CharSequence)=======");
		System.out.println(sb2.toString());
		System.out.println("DEafult Capacity :"+sb2.capacity());
		System.out.println("Length :"+sb2.length());


		
	}

}
