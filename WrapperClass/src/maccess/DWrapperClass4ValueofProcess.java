package maccess;
public class DWrapperClass4ValueofProcess {
	public static void main(String[] args) {
		
		//Float wrapper class(Float,double and string constructor)
		Float f1=Float.valueOf(12.5f);  
		Float f2=Float.valueOf(12546546.56f);
		Float f3=Float.valueOf("56756.554f");
		
		//Character Wrapper Class(Only Character constructor)
		Character ch1=Character.valueOf('f');
		
		//Long Wrapper Class(Long and string constructor)
		Long l1=Long.valueOf(78576897096887459l);
		Long l2=Long.valueOf("7685695670709");
		
		
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
