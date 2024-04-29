package useful.ch03;

public class PasswordMainTest {
	// 메인 쓰레드
	public static void main(String[] args) {
		
		Password password = new Password();
		
		String inputPwd = null;
		inputPwd = "abc@";
		
		// 테스트 해보니까 아래 코드는 예외가 발생하는 코드이다.
		// 해결방법
		// 1. 직접 예외 처리
		// 2. 던지기 -> main보다 바깥은 의미가 없어서 결국 에러 나옴
		try {
			password.setPwd(inputPwd);			
		} catch (PasswordException e) {
			System.out.println("우리가 정의한 password 예외 발생");
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
		
	}// end of main

}// end of class
