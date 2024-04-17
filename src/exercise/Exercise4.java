package exercise;

import java.util.Scanner;

public class Exercise4 {
	// 코드의 시작점
	public static void main(String[] args) {

		System.out.println("\n메뉴 선택");
		System.out.println("1.등록, 2.조회, 3.수정, 4.삭제, 0.종료");
		System.out.print("선택 = ");
		// 사용자에게 입력값 받기
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		// \n = 스페셜 캐릭터 라인 ==> 구분줄 &시작할 때 한줄 내림.
		// 특정 조건을 만날때 반복문을 종료해야 한다면
		// 깃발!
		boolean flag = true;
		while (flag) {
			if (choice == 1) {
				System.out.println("등록을 선택했습니다.");
			} else if (choice == 2) {
				System.out.println("조회를 선택했습니다.");
			} else if (choice == 3) {
				System.out.println("수정을 선택했습니다.");
			} else if (choice == 4) {
				System.out.println("삭제를 선택했습니다.");
			} else if (choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else{
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");				
			}
			System.out.println("---------------------------");
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록, 2.조회, 3.수정, 4.삭제, 0.종료");
			System.out.print("선택 = ");
			choice = sc.nextInt();
		}
		sc.close();

	}// end of main

}// end of class
