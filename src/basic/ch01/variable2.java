package basic.ch01;

public class variable2 {
	

	//코드의 시작점(main) 함수
	public static void main(String[] args) {
	
		//변수의 이름을 만들 때 규칙이 있다.
		
		//1. 대소문자를 명확히 구분하며 길이에 제한이 없다.
		// 값을 넣다 = 초기값을 넣다 = 초기화 하다.
		int age = 10;
		int AGE = 20;
		int aGe = 30; // 변수의 선언과 동시에 초기화(값을 넣다)
		//int age;
		
		
		//2. 자바에서 사용하는 예약어는 사용할 수 없다.
		// ex):int , double , if , for
		//int if; (오류발생)
		
		
		//3. 변수는 숫자로 시작할 수 없다.
		// int 30age; <--오류발생
		// int 20Man; <--오류발생
		
		//4. 특수 문자는 언더바(_), 달러($) 표기만 가능 하다.
		int _count;
		int $_tel;
		int $count_test;
		//int *count; <-- 오류 발생
		
		
		//권장 사양 - 변수를 선언할 때 소문자 부터 시작하자.
		int GIVE; // 문법적 오류는 없으나 추천하지 않음.
		
		// 변수선언과 동시에  초기화가 가능하다.
		int score = 10;
		// 한 문장에 여러개의 변수 선언이 가능하다.
		// 사용은 가능하지만 권장 사항은 아니다.
		int score1, score2, score3;
		
		
	} //end of main
	
	
} // end of class
