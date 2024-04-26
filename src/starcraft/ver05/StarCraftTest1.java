package starcraft.ver05;

public class StarCraftTest1 {

	public static void main(String[] args) {
		
		Zealot zeal1 = new Zealot("질럿1");
		Marine mar1 = new Marine("마린1");
		Zergling zerg1 = new Zergling("저글링1");
		
		zeal1.showInfo();
		mar1.showInfo();
		zerg1.showInfo();
		System.out.println("------------------------------");
		
		zeal1.attack(mar1);
		zerg1.attack(mar1);
		
		mar1.showInfo();
		
	}// end of main

}// end of class
