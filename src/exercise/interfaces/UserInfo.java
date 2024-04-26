package exercise.interfaces;

// DTO 개념으로 바라볼 수 있다.
public class UserInfo {
	
	public static int SERIAL_NUM = 0;
	private int id; // PK --> 식별자 , 동명이인 등의 경우를 방지
	private String userName;
	private String pw;
	
	public UserInfo(String username, String pw) {
		this.userName = username;
		this.pw = pw;
	}
	
	public int getId() {
		return id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPw() {
		return pw;
	}
	
	@Override
	public String toString() {
		return id + ", " + userName + ", " + pw;
	}
	
}
