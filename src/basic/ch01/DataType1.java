package basic.ch01;
/* 데이터 타입이란
 * 상자에 들어갈 수 있는 값의 유형과 크기를 지정하는 것
 */
public class DataType1 {

	// 코드의 시작점
	public static void main(String[] args) {
		
		//데이터 타입의 종류
		//1. 기본 자료형(primitive data type)
		//2. 참조 자료형(Reference data type)
		
		
		// 기본 자료형 
		// [정수형, 문자형, 실수형, 논리형] 4가지로 구분함.
		
		// 정수형 - 소숫점 이하를 포함하지 않는 숫자로 이루어진 형식
		// ex): 1, 2, -5, 100
		
		byte byteBox;  	// 1바이트 크기 -> 0또는 1 한개는 1bit -> 8bit 는 1byte
		short shortBox;	// 2바이트 크기 -> 16bit -> 2byte
		int intBox;		// 4바이트 크기 -> 32bit -> 4byte
		long longBox;	// 8바이트 크기 -> 64bit -> 8byte
		
		
		// 위 상자들은 정숫값을 담을 수 있는 상자들 인데 크기가 정해져 있다.
		byteBox = -128;
		byteBox = 127;
		// byteBox = 128; 오류
		
		shortBox = -32768;
		shortBox = 32767;
		
		// 약 21억까지 사용 가능.
		intBox = -2147483648;
		intBox = 2147483647;
		
		// 약 9경까지 			
		longBox = -9223372036854775808L; //숫자 마지막에 L은 접미사라고 합니다.  
		longBox = 9223372036854775807L;  //int 값이 아니라 long 값이라고 표시 용도이다.
		
		// L value = R value
		// 보통 오른쪽에 기술 되는 수의 기본 단위는 4바이트 크기인 int 형으로 먼저 인지한다.
		// 정수형의 기본 연산 단위는 int 형이다.
				
		// 8비트는 1바이트, bit 는 물리적인 단위, byte는 논리적인 단위이다. 
		
		// 문자형 - 
		
		
		
		
	}// end of main

}// end of class
