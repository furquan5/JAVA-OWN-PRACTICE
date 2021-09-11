package test;
public class CClass extends PClass{
	public int a;
	public void m(int y) {
		System.out.println("======CClass m()======");
		System.out.println("The value y:"+y);
	}
	public void setData(int v1, int v2, int v3, int v4) {
		super.a=v1;//PClass variable
		this.a=v2; // CClass variable
		this.getData(v3,v4); // same class method call
		
	}
	public void getData(int v3, int v4) {
		System.out.println("PClass a:"+super.a);
		System.out.println("CClass a:"+this.a);
		super.m(v3);
		this.m(v4);
		
	}

}
