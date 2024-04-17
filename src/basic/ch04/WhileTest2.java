package basic.ch04;

import java.util.Scanner;

public class WhileTest2 {
	//코드의 시작점
	public static void main(String[] args) {
		
		
		// 특정 조건일 떄 반복문을 종료 시켜 보자.

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int start = 1;
		int end = sc.nextInt();
		boolean flag = true; // 깃발 
		
		while(flag) {
			if(start == end) {
				System.out.println(" If 구문이 동작함 ");
				flag = false;
				return;
			}// end of if
			System.out.println("start = "+ start);
			
			start++;
		}// end of while
		
		System.out.println("finish");
		
		
	}//end of main

}// end of class
