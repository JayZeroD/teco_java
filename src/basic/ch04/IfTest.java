package basic.ch04;
// 변수명을 지정할 때 -- 약속 ( 권장 사항 ) --> 코딩 컨벤션
// int (소문자)my(대문자)Score; <-- 카멜(낙타의 등 모양) 로테이션(표기법)
// 첫 시작의 단어를 소문자로 작성하고 연결되는 단어는 대문자로 표기하는 방법
// -------
// 첫 시작의 단어를 대문자로 작성하고 연결되는 단어는 대문자로 표기하는 방법 
// -> 파스칼 케이스(파스칼 표기법) 
public class IfTest {

	//코드의 시작점(메인 함수)
	public static void main(String[] args) {
		
		// 조건문 ( 제어문 ) if 
		// 주어진 조건에 따라서 실행이 이루어지도록 흐름을 만든다.
		// if .... -> 만약 ...이라면 
		
		boolean flag = true;
//		boolean flag = false;
		
		if (flag) {
			// 수행 구문
			System.out.println("너 출력됨^^");
			flag = false;
			
		}//end of if --> 블록의 범위를 기억하자.
		// if 문 단독은 수행 될 수도 있고 안될 수도 있다.
		
		System.out.println(" 코드가 여기까지 내려 옵니다. = "+flag);
		
	}// end of main

} // end of class
