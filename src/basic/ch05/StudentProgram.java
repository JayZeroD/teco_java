package basic.ch05;

public class StudentProgram {
	
	// 코드의 시작점(메인함수)
	public static void main(String[] args) {
		
		int n1 = 1;
		double d1 = 5.0;
		
		// 참조 타입 ( 주소가 들어간다 )
		Student student1 = new Student();
		Student student2 = new Student();
		// . 연산자를 통해 속성에 접근 할 수 있다.
		
		student1.name = "홍길동";
		// 콘솔창에 student1(변수에 연결되어 있는 객체의 이름을 출력하시오.)
		System.out.println(student1.name);
		
		student2.name = "이순신";
		System.out.println(student2.name);
		
		// 객체가 저장된 주소의 좌표가 출력
		System.out.println(student1);
		System.out.println(student2);
		
		
		
	}//end of main

}// end of class
