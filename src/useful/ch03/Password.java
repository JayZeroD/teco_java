package useful.ch03;

public class Password {
	
	private String pwd;
	
	// getter
	public String getPwd() {
		return pwd;
	}
	// setter
	public void setPwd(String pwd) throws PasswordException{
		if(pwd == null) {
			throw new PasswordException("비밀번호는 null 값일 수 없습니다.");
		}
		
		if(pwd.length() < 5) {
			throw new PasswordException("비밀번호는 다섯자 이상이어야 합니다.");
		}
		// matches --> 정규 표현식을 활용할 수 있다.
		// pwd <== a~z , A~Z 범주 안의 값이라면 결과는 true.
		// pwd <== a, 10, ! ==> false
		if(pwd.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 반드시 숫자나 특수문자를 포함해야 합니다.");
		}
		this.pwd = pwd;	
	}
	
	
}// end of class
