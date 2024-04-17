package basic.ch07;

public class StudentMainTest1 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentId = 1001;
		student1.studentName = "지코";
		student1.address = "푸른 언덕";
		student1.study();
		student1.breaktime();
		student1.showInfo();
		// int의 지역변수 기본값은 0
		// String의 지역변수 기본값은 Null
		System.out.println("-------------------");
		
		Student student2 = new Student();
		student2.studentName = "펩시";
		student2.studentId = 2001;
		student2.address = "붉은 언덕";
		student2.showInfo();
		
		
	}
	
	//함수
	//자바에서 함수란 객체와 상관없이 독립적으로
	// 기능을 수행하는 일련의 코드 묶음이다.
	static double addDouble(double d1, double d2) {
		return d1 + d2 ;
	}

}
