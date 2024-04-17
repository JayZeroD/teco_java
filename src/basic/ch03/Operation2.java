package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {

		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해보기
		//int result4 = 5 / 3;
		//double result4 = 5 / 3;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		// 연습문제
		// 1. (12+3) /3 값을 화면에 출력하시오.
		// 변수명 , 데이터 유형을 스스로 결정하고 식을 만들어보자.
		
		int a = (12+3) / 3;
		System.out.println(a);
		
		
		// 2. (25 % 2) 값을 화면에 출력하시오.
		
		int b  = 25 % 2;
		System.out.println(b);
		// 어떤 수를 2로 나누었을때 나머지가 0이면 짝수 1이면 홀수
		
		// 3. 15를 4로 나눈 후 , 그 결과의 절대값을 출력하시오.
		
		int c = 15 / 4 ;
		System.out.println(Math.abs(c));
		
		// 도전 문제
		// 직접 산술 연산자 문제 만들기
		
		// 서윤 도하 진철 3명으로 이루어진 a팀과 
		// 현우 민서 지윤 마이크 4명으로 이루어진 b팀의 각 점수가
		// 서윤 75점 도하48점 진철66점
		// 현우 96점 민서 15점 지윤 88점 마이크 100점 일때 
		// a팀과 b팀의 평균 점수를 구하여 정수와 실수로 각각 출력하라.
		
		double averageA = (75.0+48.0+66.0) / 3.0;
		double averageB = (96.0+15.0+88.0+100.0) / 3.0;
		
		System.out.println("A팀의 평균 점수는 = "+averageA);
		System.out.println("A팀의 평균 점수는 = "+(int)averageA);
		System.out.println("B팀의 평균 점수는 = "+averageB);
		System.out.println("B팀의 평균 점수는 = "+(int)averageB);
		
				
		 
		
		
		
		
		
	}//end of main

}//end of class
