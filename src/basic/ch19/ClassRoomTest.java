package basic.ch19;

public class ClassRoomTest {

	public static void main(String[] args) {
		
		ClassRoom classRoomA = new ClassRoom("C4");
		Student student1 = new Student("홍길동" , 20);
		Student student2 = new Student("이순신" , 24);
		
		classRoomA.addStudent(student1);
		classRoomA.addStudent(student2);
		classRoomA.showStudents();
		
	}// end of main

}// end of class
