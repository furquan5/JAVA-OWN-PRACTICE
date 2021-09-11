package test;
public class Greater implements IComparable {
	public int CompareTo(int x,int y) {
		if(x>y) return x;
		else return y;
		
	}

}
