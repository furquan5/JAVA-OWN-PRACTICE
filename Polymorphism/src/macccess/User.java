package macccess;
public final class User {
	private final String userName,passWord;
	public User(String userName,String passWord) {
		this.userName=userName;
		this.passWord=passWord;
		}
	public final String getUserName() {
		return userName;
	}
	public final String getPassWord() {
		return passWord;
	}
	

}
