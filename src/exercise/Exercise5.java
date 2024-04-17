package exercise;

import java.util.Iterator;
import java.util.Scanner;

public class Exercise5 {
	// 코드의 시작점
	public static void main(String[] args) {

		// 1단계 = 세로 반복의 횟수 ( for - 의 횟수)

		// * -1
		// ** -2
		// *** -3
		// **** -4
		// ***** -5

		for (int i = 0; i < 5; i++) { // 5번 반복

		}

		// 2단계
		System.out.println("*");
		System.out.println();
		System.out.println("**");
		System.out.println();
		System.out.println("***");
		System.out.println();
		System.out.println("****");
		System.out.println();
		System.out.println("*****");
		System.out.println();

		System.out.println("---------------------------------------");

		for (int j = 0; j < 1; j++) {
			System.out.print("*");
		}
		System.out.println(); // 1번 동작
		for (int j = 0; j < 2; j++) {
			System.out.print("*");
		}
		System.out.println(); // 2번 동작
		for (int j = 0; j < 3; j++) {
			System.out.print("*");
		}
		System.out.println(); // 3번 동작
		for (int j = 0; j < 4; j++) {
			System.out.print("*");
		}
		System.out.println(); // 4번 동작
		for (int j = 0; j < 5; j++) {
			System.out.print("*");
		}
		System.out.println();//5번 동작
		
		// outer for
		for (int i = 0; i < 5; i++) {

			//inner for 
			// 첫번째 동작 : j = 0, j <= 0	-->  한번 동작 -> * -> 줄바꿈
			// 두번째 동작 : j = 0, j <= 1  --> 0,1 for 두번 동작 --> ** -> 줄바꿈
			// 세번째 동작 : j = 0, j <= 2  --> 0,1,2 for 세번 동작 --> *** -> 줄바꿈
			// 네번째 ...
			// 다섯번째 ...
			System.out.println();
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

		}

	}// end of main

}// end of class
