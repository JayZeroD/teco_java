package basic.ch03;

/*
 * 논리 연산자
 * 관계 연산자와 혼합하여 많이 사용 된다.
 * 연산의 결과는 오직 true, false로 반환 된다.
 * 
 */

public class Operation6 {

	public static void main(String[] args) {
		
		// 논리 연산자는 3가지 종류가 있다.
		// 논리곱 --> && (엠퍼센트, 엠퍼센트)
		// 논리합 --> || (버티컬 바, 버티컬 바)
		// 부정 --> ! (느낌표)
		
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. 논리곱(&&)
		// 논리곱은 전부 true 이면 true 반환 / 하나라도 거짓이면 false를 반환.		
		// 		T	=	T	&&	T
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		System.out.println("-------------------------------------------------------");
		
		//		F	=	T	&&	F
		boolean flag2 = (num1 > 0) && (num2 < 0);
		System.out.println(flag2);
		System.out.println("-------------------------------------------------------");

		// 2. 논리 합(||) 
		// 둘중에 하나라도 true 이면 논리합 연산의 결과는 true이다.
		//		T	=	T		||		F
		boolean flag3 = (num1 > 0) || (num2 < 0);
		System.out.println(flag3);
		System.out.println("-------------------------------------------------------");
		
		//3. 부정
		System.out.println("부정 논리 연산자 사용 = "+ !flag3); // 원래 값은 바뀌지 않음
		System.out.println(flag3); // 연산의 값을 모를 때 -> 컴파일 해서 확인하기 (로깅 한다.)
	}// end of main

}// end of class
