package test;

public class PinCheck {
	public boolean z=false;
	public boolean verify(int pinNo) {
		switch(pinNo) {
		case 1111:z=true;
		break;
		case 2222:z=true;
		break;
		case 3333:z=true;
		break;
		} //end of switch
		return z;
	}

}
