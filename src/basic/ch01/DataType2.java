package basic.ch01;

/*문자 데이터 타입
 * char 자료형의 크기는 2byte 입니다.
 */

public class DataType2 {

	public static void main(String[] args) {

		// 기본 자료형 중 문자 타입 ( 사실은 정수형)
		// 문자를 저장하기 위한 변수를 선언할 때 사용
		// char 타입은 단, 하나의 문자만을 저장할 수 있음.
		
		char charBox;
		charBox = 'A'; // char 는 홑따음표를 사용한다.
		System.out.println(charBox);
		
		//charBox = '가나' -> 불가능
		
		// 참고 ! 두개 이상의 문자가 연속된 형태를 문자열(string)이라고 함
		// -> "안녕반가워"
		
		System.out.println("-----------------------------");
		System.out.println((int)charBox);
		
		/*인코딩이란?
				*이진수를 문자형으로 바꾸는 과정을 일반적으로 "인코딩(Encoding)"
				*이라고 합니다. 인코딩은 정보를 특정 형식으로 변환하는 과정을 
				*의미하며, 주로 컴퓨터에서 데이터를 다룰 때 사용됩니다.
				*
				*디코딩이란?
				*
				*문자를 이진수로 변환하는 과정은 일반적으로 "디코딩(Decoding)"
				*이라고 합니다.디코딩은 인코딩의 반대 과정으로,
				*정보를 특정 형식에서 원래의 형식으로 변환하는 과정을 의미합니다.
				*/
		char quiz = 'b';
		
		System.out.println((int)quiz); // a = 97, b = 98, c = 99
		
		
	}//end of main

}// end of class
