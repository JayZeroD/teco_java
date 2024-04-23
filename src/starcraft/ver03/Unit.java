package starcraft.ver03;

/**
 * public protected -- 상속 관계에서 설정할 수 있다( 자식클래스에 접근 허용 ). default private
 */
public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void showInfo() {
		System.out.println(" ==== 상태창 ==== ");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("생명력 : " + this.hp);
	}

	public void beAttacked(int power) {
		if (hp <= 0) {
			System.out.println("[" + this.name + "]" + "이(가) 이미 사망하였습니다.");
			hp = 0;
			return;
		}
		hp -= power;
	}

	public void attack(Zealot z) {
		System.out.println(this.name + "이(가) " + z.getName() + "을 공격합니다.");
		z.beAttacked(this.power);
	}

	public void attack(Zergling ze) {
		System.out.println(this.name + "이(가) " + ze.getName() + "을 공격합니다.");
		ze.beAttacked(this.power);
	}

	public void attack(Marine m) {
		System.out.println(this.name + " 이 " + m.getName() + "을 공격합니다.");
		m.beAttacked(this.power);
	}
}