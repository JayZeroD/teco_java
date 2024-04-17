package basic.ch02;
/*
 *형 변환이란? 
 * 데이터 타입을 다른 타입으로 변경 하는것
 * 자동 형변환, 강제 형변환의 2가지 경우가 있다.
 * 
 * 
 * 
 * 
 */
public class TypeConversion {
	//코드의 시작점
	public static void main(String[] args) {
		
		int intDataBox = 100; // 4byte
		double doubleDataBox; // 8byte
		
		// 100 -> 100.0
		doubleDataBox = intDataBox;
		// 작은 상자에서 큰 상자로 들어가는 개념
		System.out.println(doubleDataBox);
		// 자동으로 정수에서 실수로 변환됨 -> 자동 형변환.
		
		System.out.println("-----------------------------------------");
		
		// 강제 형변환이란?
		final double PI = 3.14159;
		//int intBox = PI; // 컴파일러가 작은 상자에 큰 상자의 값을 넣을수 없다고 알려줌.
		// 컴파일러에 강제로 넣을 수 있음.
		int intBox = (int)PI;
		System.out.println(intBox);
		//소수점 값을 그냥 버림, 데이터 손실이 발생 ( 3.14159 -> 3 )
		
		//practice
		double interestRate;
		int discount;
		interestRate = 15.5;
		// discount 변수에 강제 형변환을 하여 값을 넣어보자.
		discount = (int)interestRate;
		System.out.println(discount);
		
		System.out.println();
		
		
	}// end of main

}// end of class
