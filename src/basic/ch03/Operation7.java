package basic.ch03;

/*
 * 빠른 평가 란?
 * 논리 연산에 있어 첫번째 조건이 결과를 이미 결정했다면
 * 두번째 조건을 평가하지 않는 것을 의미한다. 
 * 
 */

public class Operation7 {

	public static void main(String[] args) {
		
		int number = 5;
		int index = 0;
		
		// 빠른 평가가 동작하는 식을 만들어 보자.
		// 					=		15<10( 이미 false)	&&	~~~		
		boolean result = ((number = number + 10) < 10) && ((index = index + 2) <10 );
		System.out.println("현재 number 변수의 값은 = " + number);
		System.out.println("현재 index 변수의 값은 = " + index); 
		// 빠른평가에 의해 index가 2가 아니고 0이 출력됨.
		
		// number 값 재설정
		number = 5;
		
		// 논리합을 이용한 빠른 평가 식을 만들어 보자.
		// result = ((number = number + 10) < 10); 복합대입 연산자 활용 가능
		//				F				||			2 < 10 T
		result = ( (number += 10) < 10 ) || ( (index += 2 ) < 10 );
		
		
		// 현재 넘버에 담긴 값은 = 15
		// 현재 인덱스에 담긴 값은 2
		System.out.println("number = " + number);
		System.out.println("index = " + index);
		// number 와 index 연산의 위치를 바꿔서 출력 해 보자.
		result = ( (index += 2 ) < 10 ) || ( (number += 10) < 10 );
		System.out.println("number = " + number);
		System.out.println("index = " + index);
		
		
		
	}// end of main

}// end of class
