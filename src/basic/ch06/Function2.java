package basic.ch06;

public class Function2 {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;
		int sum;
		add(10, 10);
		int result2 = calcSum(1,10);
		System.out.println(result2);
		int result3 = calcSum(77,108);
		System.out.println(result3);
		
		
	}// end of main

	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}

	// 연습 문제
	// 함수를 수정 --> 파라메터 정수 2개를 받을수 있도록 설계
	// s1, s2  --> s1 + (s1+1) + (s1+2) ... + (s2) 
	// 1, 10 --> 55
	// 7, 200 --> 7 + 8 + 9 ... + 200

	static int calcSum(int n1, int n2) {

		int sum = 0;
		int i;
		for (i = n1; i <= n2; i++) { // 101번 동작하는 녀석
			sum += i; 

		}
		return sum;
	}

}
