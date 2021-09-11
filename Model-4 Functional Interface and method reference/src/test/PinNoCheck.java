package test;
public class PinNoCheck {
	public boolean z=false;
	public boolean verify(int pinNo) {
		switch(pinNo) {
		case 1111: z=true;
			break;
		case 2222: z=true;
		break;
		case 3333: z=true;
		break;
		case 4444: z=true;
		break;
		}
		return z;
		
	}

}
