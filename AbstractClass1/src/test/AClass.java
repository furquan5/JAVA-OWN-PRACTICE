package test;
public abstract class AClass {
	public double x,z;
	public AClass (double x){
		this.x=x;
	}
	public void cal() {
		z=Math.pow(x, 3);
	}
	public abstract void dis();
}
