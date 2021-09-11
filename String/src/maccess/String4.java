package maccess;
import java.util.*;
public class String4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String...");
		String s1=s.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			switch(s1.charAt(i)) {
			case 'a':
			case 'A' : count+=1;
			break;
			case 'e':
			case 'E':  count+=1;
			break;
			case 'i':
			case 'I': count++;
			break;
			case 'o':
			case 'O': count++;
			break;
			case 'u':
			case 'U': count++;
			break;
			
			}//end of switch
		}//end of loop 
		System.out.println("The number of consonants  in the string "+s1+" is "+(s1.length()-count));
		s.close();

	}

}
