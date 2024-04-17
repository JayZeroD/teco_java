package basic.ch10;

public class Hero {
	
	private String name;
	private int hp;
	private int power;
	private double depense;
	private boolean isDie;
	
	//getter , setter 메소드를 만들어 보시오.
	
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public double getDepense() {
		return this.depense;
	}
	public boolean getIsdie() {
		return this.isDie;
	}
	
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setHp(int inputHp) {
		this.hp = inputHp;
	}
	public void setPower(int inputPower) {
		this.power = inputPower;
	}
	public void setDepense(double inputDepense) {
		this.depense = inputDepense;
	}
	public void setIsDie(boolean inputIsDie) {
		this.isDie = inputIsDie;
	}
	
	
	
}
