package basic.ch01;

public class DataType3 {
	
	// 메인함수 - 코드의 시작점
	public static void main(String[] args) {

		//기본 데이터 타입
		//참조 데이터 타입
		
		// 기본 데이터 타입 - 실수형
		// float, double
		
		float floatBox1 = 0.5f; //f는 접미사 , float의 크기는 4byte
		float floatBox2 = 0.5F; //접미사는 대소문자 구별x
		
		double doubleBox1 = 0.123;
		double doubleBox2 = 1.12345678;
		// double = 8byte 크기. 실수의 기본 연산 단위이다.
		// 소수점을 더 많이 표현 할 수 있기 떄문에 값의 정확도를 높일 수 있다.
		
		// 콘솔창 결과 출력 - 콘솔창에서는 기본적으로 정확한 데이터 타입을 확인 불가.
		System.out.println(floatBox1);
		System.out.println(doubleBox1);
		
		System.out.println(0.5f);
		System.out.println(0.10d);
		
		
		
	}//end of main

}// end of class
