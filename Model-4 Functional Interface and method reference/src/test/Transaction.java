package test;
public interface Transaction {
	public static final Balance b=new Balance();
	public abstract void process(double amt);

}
