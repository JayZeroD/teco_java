package starcraft.ver02;

import java.util.Scanner;

public class StarCraftTest2 {

	public static void main(String[] args) {
		
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;
		
		GateWay gateWay1 = new GateWay(1);
		GateWay gateWay2 = new GateWay(2);
		
		Barracks barracks1 = new Barracks(1);
		Barracks barracks2 = new Barracks(2);
		
		
		
		Zealot zealot1 = gateWay1.makeZealot("럿질1");
		Zealot zealot2 = gateWay1.makeZealot("럿질2");
		System.out.println(gateWay1.getGateWayNumber() + " : " + gateWay1.getCount());
		System.out.println(gateWay2.getGateWayNumber() + " : " + gateWay2.getCount());
		System.out.println("---------------------");
		
		Marine marine1 = barracks1.createMarine("마린1"); 
		Marine marine2 = barracks2.createMarine("마린2");
		System.out.println(barracks1.getBarracksNumber() + " : " + barracks1.getCount());
		System.out.println(barracks2.getBarracksNumber() + " : " + barracks2.getCount());
		System.out.println("---------------------");
		
		
		
		Zergling zergling = new Zergling("저글링1");
		
		Scanner sc = new Scanner(System.in);
		
		int unitChoice = -1;
		
		do {
			System.out.println(" 유닛을 선택하시오. ");
			System.out.println("1.질럿 \t 2. 마린 \t 3. 저글링 \t 0.게임종료");
			unitChoice = sc.nextInt();
			
			if (unitChoice == ZEALOT) {
				
			} else if (unitChoice == MARINE) {
				
			} else if (unitChoice == ZERGLING) {
				
			} else {
				System.out.println("프로그램을 종료합니다");
				unitChoice = GAME_END;
			}
		} while(unitChoice != GAME_END);
		
		
		
		// while , do while
		// while --> 조건식을 확인 하고 코드를 수행하는 녀석
		// do while --> 무조건 한번은 수행을 하고 
		// 조건값에 따라 반복여부를 결정하는 녀석 
		
	//	do {
	//		반복 수행 구문
			
	//	} while(조건식);
		
	//	while ( 조건식 ) { 
	//		반복 수행 구문
	//	}
		
		
		
		
	}//end of main

}// end of class
