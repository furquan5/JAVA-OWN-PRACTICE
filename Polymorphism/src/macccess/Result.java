package macccess;
public class Result {
	public static IComparable getResult() {
		return (int x,int y)->
		{
			if(x>y) return x;
			else return y;
		};
	}

}
