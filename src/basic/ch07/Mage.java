package basic.ch07;

public class Mage {
	
	int health;
	int mana;
	int magicPower;
	String Class;
	
	public void ShowStat() {
		System.out.println("체력 : " + health);
		System.out.println("마나 : " + mana);
		System.out.println("마력 : " + magicPower);
		System.out.println("클래스 : " + Class);
	}
	
	public void FireBall() {
		System.out.println("화염구 마법으로 " + magicPower*3 + "의 "
				+ "데미지를 가했습니다."); // 메소드
	}
	
	
	
	
	
}
