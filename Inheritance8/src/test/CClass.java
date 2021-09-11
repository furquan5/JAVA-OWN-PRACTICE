package test;
public class CClass extends PClass{
	public CClass(int x,int y, int z) {
		this(x,y); //Same class constructor call
		System.out.println("The value z:"+z);
		
	}
	public CClass(int x, int y) {
		super(x); //PClass constructor call
		System.out.println("The value y:"+y);
		
	}
	

}
