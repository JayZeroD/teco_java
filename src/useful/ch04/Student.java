package useful.ch04;


public class Student {
	// 1. 생성자의 접근 제어 지시자를 private 로 변경하면
	// 외부에서 생성자를 호출 할 수 없다.
	private Student() {
	}

	// 2. static 변수를 활용한 데이터 타입 선언
	private static Student std;

	// 3. 외부에서 접근 가능한 메서드를 만들어 준다.
	public static Student getInstance() {
		if (std == null) {
			std = new Student();
		}
		return std;
	}

}
