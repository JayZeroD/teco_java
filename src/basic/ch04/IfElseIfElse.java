package basic.ch04;

public class IfElseIfElse {

	public static void main(String[] args) {

		int age = 3;

		// if elseif else 구문을 사용할 때는 조건의 범위가 아래로 갈수록
		// 더 넓어지도록 만들어야 한다. (피라미드형)
		if (age <= 7) {
			System.out.println("아직 학교에 다니지 않습니다.");
		} else if (age <= 13) {
			System.out.println("초등학교에 다니고 있습니다.");
		} else if (age <= 16) {
			System.out.println("중학교에 다니고 있습니다.");
		} else{
			System.out.println("고등학교에 다니거나 졸업을 했네요.");
		}//end of if

	}// end of main

}// end of class
