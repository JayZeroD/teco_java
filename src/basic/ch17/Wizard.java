package basic.ch17;

public class Wizard extends Hero{
	
	public Wizard(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void attack() {
		System.out.println(name + "가 기본공격을 합니다.");
	}
	
	public void freezing() {
		System.out.println(name + "가 냉기 공격을 합니다.");
	}

}

