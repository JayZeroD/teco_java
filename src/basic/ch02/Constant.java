package basic.ch02;
/*
 * 컴파일 시점 -> .class 파일을 만들어 내는 과정 (javac 명령어 동작)
 * 런타임 시점 -> ctrl + f11 프로그램 실행 ~~ 실행 종료까지.
 * java 명령어는 프로그램을 실행시키는 명령어이다.
 * java c 명령어는 번역하는 과정이다.
 * 
 * 자바 언어로 코드를 작성하고 있다
 * JDK 도구를 설치 해야 자바 프로그래밍이 가능 -> 도구들이 존재
 * JDK --> JRE(Java Runtime Environment, 자바 프로그램 실행 환경)
 * JRE --> JVM(Java Virtual Machine, 자바 가상 머신) 
 * JVM 은 .class 파일을 실행 시켜준다.
 * JVM 은 어떤 연산을 거쳐 이진코드(바이너리 파일로 변환 시켜서 수행한다.)
 */
public class Constant {
	//코드의 시작점
	public static void main(String[] args) {
		
		//상수 선언 --> 값이 한번 정해지면 변경할 수 없는 수(값,데이터)
		final int MAX_NUM = 10; // 상수 연산자 = final 
		final int MIN_NUM; // 상수는 대문자로 쓰기
		MIN_NUM = 0;

		//MAX_NUM = 100; -> 컴파일 오류 발생
		//ctrl+s 를 누르면 IDE 툴이 javac Constant.java 명령어를 수행한다.
		//그 결과 Constant.class 파일이 생성 된다.
		//why? JVM이 이해할 수 있는 언어이기 때문에 번역을 해주어야 한다.
		
		System.out.println("---------------------------------");
		//원주율 상수로 선언
		final double PI = 3.14159;
		//원의 반지름을 상수로 선언
		final int RADIOUS = 10;
		
		//원의 둘레 계산
		System.out.println( 2 * PI * RADIOUS );
		//원 내부 면적의 크기 계산
		System.out.println( PI * RADIOUS * RADIOUS);
		
		
		
	}// end of main

}// end of class
