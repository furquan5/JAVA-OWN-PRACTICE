package maccess;
public class DWrapperClass3 {
	public static void main(String[] args) {
		
		//Float wrapper class(Float,double and string constructor)
		Float f1=new Float(12.5f);  
		Float f2=new Float(12546546.565536333331);
		Float f3=new Float("56756.554f");
		
		//Character Wrapper Class(Only Character constructor)
		Character ch1=new Character('f');
		
		//Long Wrapper Class(Long and string constructor)
		Long l1=new Long(78576897096887459l);
		Long l2=new Long("7685695670709");
		
		
		System.out.println("========Display flaot========");
		System.out.println("f1  :"+f1.toString());
		System.out.println("f2  :"+f2.toString());
		System.out.println("f3  :"+f3.toString());
		
		
		System.out.println("========Display CHararcter========");
		System.out.println("ch1  :"+ch1.toString());
		
		
		System.out.println("========Display Long========");
		System.out.println("l1  :"+l1.toString());
		System.out.println("l2  :"+l2.toString());
		
	}

}
