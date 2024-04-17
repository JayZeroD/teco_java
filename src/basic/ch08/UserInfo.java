package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;

	// 생성자 오버로딩이란
	// 생성자의 개수가 여러개 있다.

	// 기본 생성자 형태 만들기.
	public UserInfo() {
	}

	// 사용자 정의 생성자 만들기.
	public UserInfo(String Id) {
		userId = Id;
		Info();
	}

	public UserInfo(String Id, String Name) {
		userName = Name;
		userId = Id;
		Info();
	}

	// 연습문제 -
	// 1 . 매개변수 3개를 받는 생성자를 만드시오.
	
	public UserInfo(String Id, String Name, String Pw) {
		userName = Name;
		userId = Id;
		userPassword = Pw;
		Info();
	}
	// 2 . 매개변수 4개를 받는 생성자를 만드시오.
	
	public UserInfo(String Id, String Name, String Pw, String Add) {
		userName = Name;
		userId = Id;
		userPassword = Pw;
		userAddress = Add;
		Info();
	}
	// 3 . 매개변수 5개를 받는 생성자를 만드시오.
	
	public UserInfo(String Id, String Name, String Pw, String Add, String Pn) {
		userName = Name;
		userId = Id;
		userPassword = Pw;
		userAddress = Add;
		phoneNumber = Pn;
		Info();
	}
	public void Info(){
		System.out.println(userName);
		System.out.println(userId);
		System.out.println(userPassword);
		System.out.println(userAddress);
		System.out.println(phoneNumber);
	}

}// end of class
