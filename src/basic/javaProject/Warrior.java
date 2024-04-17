package basic.javaProject;

public class Warrior {
	String name;
	int power;
	int hp;

	public Warrior(String myName, int myPower) {
		name = myName;
		power = myPower;
		hp = 100;
	}

	// warrior 공격을 하다.
	// mage 공격을 하다.
	public void attckMage(Mage mage) {
		System.out.println("마법사를 공격 (" + this.power + ")합니다.");
		mage.beAttacked(this.power);
	}

	// 내가 공격을 받다.
	public void beAttacked(int power) {
		if (hp <= 0) {
			System.out.println("이미 죽어있습니다.");
			return;
		}

		hp -= power;

	}

}
