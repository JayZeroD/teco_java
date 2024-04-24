package basic.ch20;

public class AnimalTest1 {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("-------------------------------");

		// 부모의 데이터 타입으로 자식 클래스의 객체를 대입하는 것 과
		// 부모 클래스의 참조 변수로 자식 클래스의 객체를 참조하는 것을 의미합니다.
		// 업캐스팅
		// 업캐스팅은 자동으로 이뤄집니다.
		Animal 주소2 = new Tiger();
		주소2.move();
		주소2.eating();
		System.out.println("-------------------------------");

		Animal 주소3 = new Human();
		주소3.move();
		주소3.eating();
		// 다운캐스팅 -> 자식 클래스의 객체를 부모 클래스의 참조 변수로 변환하는것
		// 다운캐스팅은 명시적인 형변환을 해줘야 함.
		((Human) 주소3).readBooks();
		System.out.println("-------------------------------");

	}// end of main

}// end of class
