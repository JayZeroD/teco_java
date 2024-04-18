package basic.ch11;

public class PersonTest {
	// 코드의 시작점 - 메인함수
	public static void main(String[] args) {
		
		Person person1 = new Person("홍길동", 100);
		Person personBox = person1;
		Person personBox2 = person1.getPerson();

		Person personLee = new Person("이순신", 101);
		System.out.println("-------------------");
		// 위 코드까지는 Heap 메모리 영역에 객체가 2개 생성된 상태이다.
		// 지역변수인 person1 , personBox, personBox2 는 
		// 같은 객체(person1의 주소)를 가리킨다.
		
		// 연습문제 -
		// setName 메서드를 만들어 주세요.
		
		personBox2.setName("티모");
		person1.showInfo();
		String nam = personBox.getName();
		System.out.println(nam);
		
	}// end of main

}// end of class
