package maccess;
import java.util.*;
public class ReverseString2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		
		char []ch=str.toCharArray();
		int right=0,left=0;
		right=ch.length-1;
		for(left=0; left<right ;left++,right--){
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
		}
		for(Character c:ch) {
			System.out.print(c);
		}
	}
}
