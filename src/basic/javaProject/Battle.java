package basic.javaProject;

import java.util.Scanner;

public class Battle {
	// 코드의 시작점 --> 실행의 흐름을 만들 수 있다.
	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("작은오크", 10);
		Warrior warrior2 = new Warrior("큰 오크", 30);
		Mage mage1 = new Mage("7급마법사", 20);
		System.out.println("몇번 공격하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int inputData = sc.nextInt();
		System.out.println("전사가 마법사를"+ inputData + "번 공격합니다.");
		for(int i=0; i<inputData; i++) {
			warrior1.attckMage(mage1);
		}
		
		System.out.println("마법사의 현재 HP : " + mage1.hp);
		
	}// end of main

}// end of class
