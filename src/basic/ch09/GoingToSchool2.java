package basic.ch09;

import java.util.Scanner;

public class GoingToSchool2 {
	// 코드의 시작점 - 메인 함수
	public static void main(String[] args) {
	
		// 설계된 클래스를 가지고 본인이 의도한대로 
		// 실행의 흐름을 만들어 보자.
		
		// 스캐너를 활용해서 1번을 누르면 버스를 타고 등교하고
		// 2번을 누르면 지하철을 타고 등교하도록 실행의 흐름을
		// 만들어 보자.
		//Bus bus; // -> 선언만 했을시 초기화가 되지 않아 오류
		Bus bus1 = new Bus(100); 
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Student s1 = new Student("철수", 100_000);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("등교할 때 이용할 교통수단을 선택하시오");
		System.out.println("1. 버스 , 2. 지하철");
		int busChoice;
		int subwayChoice;
		int input = sc1.nextInt(); 
		
		if(input == 1) {
			System.out.println("몇번 버스를 탈 건지 선택하시오");
			System.out.println("1. 100번 버스, 2. 200번 버스.");
			busChoice = sc1.nextInt();
			if(busChoice == 1) {
				s1.takeBus(bus1);
				s1.showInfo();
			}
			else if(busChoice == 2) {
				s1.takeBus(bus2);
				s1.showInfo();
			}
			else {
				System.out.println("등교에 실패하였습니다!!");
			}
		}
		else if (input == 2) {
			System.out.println("몇호선 지하철을 탈 건지 선택하시오");
			System.out.println("1. 1호선 지하철, 2. 2호선 지하철.");
			subwayChoice = sc1.nextInt();
			if(subwayChoice == 1) {
				s1.takeSubway(subway1);
				s1.showInfo();
			}
			else if(subwayChoice == 2) {
				s1.takeSubway(subway2);
				s1.showInfo();
			}
			else {
				System.out.println("등교에 실패하였습니다!!");
			}
			
			
		}
		else {
			System.out.println("등교에 실패하였습니다!!");			
		}
		
		
		
	}// end of main

}// end of class
