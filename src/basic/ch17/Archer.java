package basic.ch17;

public class Archer extends Hero{
	
	public Archer(String name, int hp) {
		super(name, hp);
	}
	
	@Override
	public void attack() {
		System.out.println(this.name + "가 기본공격을 합니다.");
	}
	
	public void fireArrow() {
		System.out.println(super.name + "가 화염 화살 공격을 합니다.");
	}

}
