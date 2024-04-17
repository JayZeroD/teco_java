package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 101, 3); // 객체
		System.out.println(s1); // 객체의 주소값이 출력됨
		
		// 연습문제
		// s2 참조 변수의 이름으로 학생을 메모리에 올리고
		// 호출하시오.
		
		Student s2 = new Student("김철수", 202, 2);
		System.out.println(s2); 
		
		// 변수에 직접 접근해서 값을 초기화 해보시오.
		Student s3 = new Student(); // 기본 생성자로 메모리 올림.
		s3.grade = 1;
		s3.name = "류현진";
		s3.number = 99109;
		s3.showInfo();
		
		// 생성자를 여러개 만들어 줄 수 있다.
		// 생성자 오버로딩 이라고 한다.
		
	}// end of main

}// end of class
