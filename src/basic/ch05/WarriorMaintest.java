package basic.ch05;

public class WarriorMaintest {

	// 메인함수 (코드의 시작점) --> 코드 시작시 JVM STACK에 메모리 할당
	public static void main(String[] args) {
		
		// new -> 예약어,키워드, () <-생성자
		Warrior warrior1 = new Warrior();
		// 메모리에 올라가면 객체라고 부른다. heap(동적 메모리 영역) 
		// 객체의 접근은 . 연산자를 통해 이루어진다.
		
		Warrior warrior2 = new Warrior();
		
		warrior1.name = "바바리안";
		warrior1.health = 100;
		warrior1.attckPower = 30;
		warrior1.defensePower = 1;
		
		System.out.println("-------------------------------------");
		
		warrior2.name = "광전사";
		warrior2.health = 120;
		warrior2.attckPower = 20;
		warrior2.defensePower = 2;
		
		System.out.println("-------------------------------------");
		System.out.println(warrior1.name);
		System.out.println(warrior2.name);
		
		
	}

}
