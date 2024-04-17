package basic.ch07;

public class User {
	
	String id;
	String password;
	String name;
	String gender;
	int age;
	
	// 패스워드 체크 기능 만들어보기
	// 메소드나 함수는 동사로 시작하는것이 권장 사항
	public boolean cheakPassword(String inputPwd) {
		// 만약 나의 멤버변수에 들어가있는 
		// password 값과 외부에서 넣을 inputPwd값이
		// 같다면 true 반환 아니면 false를 반환하라
		// == (주소값 , 산술식일때 사용)
		// String(문자열) 비교는 equals 라는 메소드사용
		if(password.equals(inputPwd)) {
			return true;
		}
		return false;
	}
	
	// 메인 메소드는 독립적인 함수로써 여기서 실행 시킬 수 있다.
	
	public static void main(String[] args) {
		// 유저라는 클래스를 인스턴스화 시키시오.
		User user1 = new User();
		user1.password = "157100";
		User user2 = new User();
		user2.password = "000417";
		System.out.println("------------------------------------");
		
		// user1,2의 pwd를 확인 하고 싶다.
		boolean result1 = user1.cheakPassword("123456");
		System.out.println("user1 : " + result1);
		System.out.println("------------------------------------");
		// 참조 변수 user2 기능인 cheakPassword를 호출해서 결과를 확인해 주세요
		// -- F
		// -- T
		
		// 실행의 흐름을 만드는 연습
		// if구문을 활용해서 
		// 콘솔창에 비밀번호가 틀렸습니다. 출력
		// 콘솔창에 비밀번호가 일치합니다. 출력
		boolean result2 = user1.cheakPassword("157100");
		System.out.println("user1 : " + result2);
		boolean result3 = user2.cheakPassword("157100");
		printConsol(result3);
		boolean result4 = user2.cheakPassword("000417");
		printConsol(result4);
		
	}
	
	static void printConsol(boolean cheakResult){
		if(cheakResult == true) {
			System.out.println("비밀번호가 일치합니다.");
		}
		else {
		System.out.println("비밀번호가 다릅니다.");
		}
	}

	
	
}// end of class
