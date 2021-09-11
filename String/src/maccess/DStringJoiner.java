package maccess;
import java.util.*;
public class DStringJoiner {
	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner("-");
		sj.add("22");
		sj.add("02");
		sj.add("1999");
		System.out.println("The DOB is :"+sj.toString());
	}

}
