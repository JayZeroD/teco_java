package basic.ch22;

/* 
 * 
 */
interface Animal {
	// 인터페이스 안에는 추상 메서드만 선언 가능

	// public abstract void eat();
	// public abstract void move();

	// 축약 가능
	void eat();

	void move();

}

// implements ==> 구현하다. 인터페이스는 extends x implements o
class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("먹이를 먹다.");
	}

	@Override
	public void move() {
		System.out.println("촐랑촐랑 다니다");
	}

}

class Bird implements Animal {

	@Override
	public void eat() {
		System.out.println("모이를 먹다.");
	}

	@Override
	public void move() {
		System.out.println("날아 다니다.");
	}
	
}



