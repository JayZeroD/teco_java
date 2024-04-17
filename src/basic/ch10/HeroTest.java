package basic.ch10;

public class HeroTest {

	public static void main(String[] args) {
		Hero hero1 = new Hero();
		
		hero1.setName("아이언 맨");
		
		String Name = hero1.getName();
		System.out.println(Name);
		
		hero1.setHp(2000);
		
		int hp = hero1.getHp();
		System.out.println(hp);
		
		hero1.setPower(150);
		
		int power = hero1.getPower();
		System.out.println(power);
	}

}
