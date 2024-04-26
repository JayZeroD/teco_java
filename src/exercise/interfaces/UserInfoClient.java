package exercise.interfaces;

public class UserInfoClient {
	
	// main (메인 쓰레드 : 메인 작업자)
	public static void main(String[] args) {
		
		// 사용자에게 정보를 입력하세요. --> Scanner 활용, 지금은 가정
		String inputUserName = "홍길동";
		String inputUserPw = "asd123";
		
		// DTO : Data Transfer Object --> 데이터들을 받아서(취합해서) 전달하는 역할을 가지고 있는
		// 인스턴스를 말한다.
		UserInfo info1 = new UserInfo(inputUserName, inputUserPw);
		
		
		
		// 데이터를 받아서 IUserInfoDao를 구현한 구현 클래스에게 전달하고자 한다.
		// UserInfoMysqlDaoimpl, UserInfoOracleDaoImpl 두가지가 구현되어있는 상태
		// 둘다 만들어 놓고 사용하는 프로그램에 따라 선택
		//IUserInfoDao iUserInfoDao1 = new UserInfoMysqlDaoimpl();
		IUserInfoDao iUserInfoDao1 = new UserInfoOracleDaoImpl();
		
		iUserInfoDao1.intsertUserInfo(info1);
		iUserInfoDao1.updateUserInfo(info1);
		iUserInfoDao1.deleteUserInfo(info1.getId());
		iUserInfoDao1.selectUserInfo();
		
	}//end of main

}// end of class
