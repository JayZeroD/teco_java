package basic.javaProject;

public class Mage {

	String name;
	int power;
	int hp;

	public Mage(String myName, int myPower) {
		this.name = myName;
		this.power = myPower;
		hp = 50;
	}

	public void attckWarrior(Warrior warrior) {
		warrior.beAttacked(this.power);
	}

	public void beAttacked(int power) {
		if (hp <= power && hp != 0) {
			System.out.println("적을 처치했습니다.");
			hp = 0;
			return;
		}
		else if(hp == 0){
			System.out.println("이미 죽어있습니다.");
			return;
		}
		else {
			hp -= power;
		}

	}
}
