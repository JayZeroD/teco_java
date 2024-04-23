package basic.ch16;

import basic.ch17.Archer;
import basic.ch17.Warrior;
import basic.ch17.Wizard;

public class HeroTest {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("판테온", 100);
		Archer archer1 = new Archer("애쉬", 100);
		Wizard wizard1 = new Wizard("라이즈", 100);
		
		warrior1.attack();
		archer1.attack();
		wizard1.attack();
		
	}

}
