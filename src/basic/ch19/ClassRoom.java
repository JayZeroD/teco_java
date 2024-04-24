package basic.ch19;

public class ClassRoom {

	private String className;
	private Student[] students;
	private int studentCount;
	private final int MAX_STUDENT = 30;

	public ClassRoom(String className) {
		this.className = className;
		students = new Student[MAX_STUDENT];
		this.studentCount = 0;
	}

	// 학생을 추가하는 기능 만들기
	public void addStudent(Student student) {
		if (studentCount < MAX_STUDENT) {
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println("학급 정원 초과입니다.");
		}
		
	}
	
	// 학급에 속한 모든 학생 정보를 출력하는 기능을 만드시오.
	public void showStudents() {
		for(int i = 0; i < students.length; i++) {
			// students[i] --> [객체 주소] --> heap 영역 객체를 참조
			if(students[i] != null) {
				System.out.println(i + "번 학생의 이름은 " + students[i].getName()+ " 입니다.");
				System.out.println(i + "번 학생의 나이는 " + students[i].getAge()+ " 입니다.");				
			}
		}
	}
	
	
}
