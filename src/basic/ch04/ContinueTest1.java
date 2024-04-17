package basic.ch04;

public class ContinueTest1 {

	public static void main(String[] args) {

		// 화면에 1부터 100까지의 숫자 중 3의 배수를 출력하시오.

		// 1~100 -> 반복적인 패턴 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요.
		// 반복문은 for문 사용

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}// end of main

}// end of class
