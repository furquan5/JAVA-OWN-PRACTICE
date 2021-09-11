package maccess;
public class Contact extends Object{
	public Long phNo;
	public String name;
	
	public Contact(Long phNo,String name) {
		this.phNo= phNo;
		this.name=name;
		
	}
	//@override
	public String toString() {
		return phNo+"\t"+name;
	}
}
