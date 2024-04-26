package basic.ch22;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal dog = new Dog(); // 다형성 적용 , 업캐스팅 된 상태
		dog.eat();
		dog.move();
		System.out.println("-----------------------");
		
		Animal bird = new Bird();
		bird.eat();
		bird.move();
		
		
	}// end of main

}// end of class
