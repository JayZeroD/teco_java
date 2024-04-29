package useful.ch03;

public class Nickname {
	
	String nick;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		if(nick == null) {
			throw new PasswordException("닉네임은 공백 일 수 없습니다.");
		}
		if(nick.length()<2) {
			throw new NicknameException("닉네임은 최소 2글자 이상이어야 합니다.");
		}
		if(nick.matches("[0-9]+")) {
			throw new NicknameException("닉네임은 숫자로만 이루어질 수 없습니다. 반드시 영어나 한글, 특수문자가 들어가야 합니다.");
		}
		
		this.nick = nick;
		
	}
	
	
	
}
// 표준 표현식 [...] : 문자열을 나타냄
// a-z, A-Z 모든 알파벳 문자열을 말한다.
// + : 바로 앞의 표현식이 하나 이상은 반복되어야 한다.
// 즉 "Hello" --> true반환
// "A1" , "bbb"(3글자) --> false
