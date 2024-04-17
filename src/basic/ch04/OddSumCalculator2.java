package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator2 {

	public static void main(String[] args) {
		//정수값을 입력받아서 1부터 그수까지의 홀수값만 더해서 출력하시오
		
		// 임포트 하려면 ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하세요 : ");
		int maxNumber = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=maxNumber; i+=2) {
			sum += i;
			System.out.print(" sum = " + sum + " \n");
		}
	
		
		System.out.println("sum = " + sum);
		
		
		
		
	} // end of main

}// end of class
