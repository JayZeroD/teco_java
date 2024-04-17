package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {

	public static void main(String[] args) {
		//정수값을 입력받아서 1부터 그수까지의 짝수값만 더해서 출력하시오
		
		// 임포트 하려면 ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하세요 : ");
		int maxNumber = sc.nextInt();
		// 1 <--  	10		 ->		 2+4+6+8+10;
		int sum = 0;
		
		// 10->
		// 반복적인 패턴이 확인된다
		// 1,2,3,4,5,6,7,8,9,10
		for(int i = 2; i <= maxNumber; i += 2) {
			sum += i;
			
			
		}
		
		System.out.println("sum = " + sum);
		
		
		
		
	} // end of main

}// end of class
