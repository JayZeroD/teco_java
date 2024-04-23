package basic.ch17;

public class A {

	String name;
	int height;
	int weight;
	int age;

	// 바로 수정 ... 문제가 생길 수 있음.

}

// 하나의 자바 파일 안에 여러개의 클래스를 작업 가능
// 단. public 클래스는 오직 하나만 정의 가능하다.

// 복사 붙여넣기도 가능

class B {

	String name;
	int height;
	int weight;
	int age;

	int level;
	String nickName;

}

// 상속이라는 문법을 배운 개발자라면 
// extends -> 상속 사용시의 예약어
class C extends A {
	
	int level;
	String nickName;
	String phone;
	
}
