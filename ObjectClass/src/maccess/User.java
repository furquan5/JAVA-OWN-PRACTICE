package maccess;
public class User extends Object implements Cloneable{
	//Step-1
	public String uName,pWord;
	public User(String uName,String pWord) {
		this.uName=uName;
		this.pWord=pWord;
	}
	@Override
	public String toString() {
			return uName+"\t"+pWord;
	
	}
	public Object cloning()//step-2
	{
		Object o=null;
		try {
			o=super.clone(); //Step-3
		}catch(CloneNotSupportedException cnse) {cnse.printStackTrace();}
		return o;
		}
	}


