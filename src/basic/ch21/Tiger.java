package basic.ch21;

public class Tiger extends Animal {
	
	// 재정의 - 구현 메서드
	@Override
	public void hunt() {
		System.out.println("호랑이가 앞발로 사냥합니다.");
	}
	
	@Override
	public void move() {
		System.out.println("살금살금 이동합니다.");
	}
	
}