package basic.ch14;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열이란 ?
		// 연관된 데이터를 모아서 통채로 관리하기 위한 데이터 타입.
		
		// 배열의 특징
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈 지
		// 크기를 지정해야 한다.
		
		// 배열 메모리 공간 만들기
		int[] numbers = new int[3];
		int intBoxes[] = new int[5];
		
		
		// 값 넣기 (초기화)
		// 배열의 길이 => 3
		// 인덱스 마지막 번호 => 2 ( 0부터 시작 )
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;
		
		// numbers[3] = 1003; --> 인덱스의 길이를 벗어남 , 오류 발생
		// 사전 기반 지식 : 모든 프로그램의 인덱스 시작 번호는 0부터
		
		// 배열의 선언과 동시에 초기화
		int [] grades = new int[] {5, 3, 1}; // [] 안의 크기 생략 가능
		int [] grades2 = {5,3,1}; // new int[] 생략 가능.
		
		// 문제 1 
		// 5개의 크기를 가지는 double 타입의 배열을 선언하시오
		// 단 배열의 이름은 원하는대로 작성 하시오
		double [] dragon = new double[5];
		
		
		// 문제2
		// 위에서 선언한 배열의 값을 index 0부터 2까지 초기화 하시오.
		// 값은 상관없음.
		dragon[0] = 3.14;
		dragon[1] = 3.141;
		dragon[2] = 3.1415;
		// System.out.println(dragon[3]); --> double의 초기값은 0.0
		
		// 문제3
		// String 타입의 배열을 선언, 배열의 크기는 3개,
		// 선언과 동시에 초기화 하시오.
		String [] cheeze = {"불닭볶음면", "마요네즈", "삼각김밥"};
		
	}// end of main

}// end of class
