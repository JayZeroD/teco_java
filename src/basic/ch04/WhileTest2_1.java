package basic.ch04;

public class WhileTest2_1 {
	// 코드의 시작점
	public static void main(String[] args) {

		// 1부터 5까지 덧셈 연산을 하라
		// 1 + 2 + 3 + 4 + 5

		int start = 1; // 시작값 1
		int end = 5; // 5번 반복
		int sum = 0;

		// 첫번째 반복
		// ~6번째
		// 6 <= 5 --> 거짓 --> 반복문 종료

		//특정 조건식을 만들어서 반복문을 멈추게 해야 함.
		//만약 start 값이 10이면 종료하라
		boolean flag = true;
		while (flag) {
			if(start == 10) {
				//실행의 제어권을 반납한다.
				flag = false; // 이프 , 와일 반복문 밖으로 나가서 남은 뒷 코드가 실행됨
//				return;	// 이 구문에서 클래스가 완전 종료됨
			}
			// 1회 = 0 = 0 + 1	=> 1
			// 2회 = 1 = 1 + 2 	=> 3
			// 3회 = 3 = 3 + 3 	=> 6
			// 4회 = 6 = 6 + 4 	=> 10
			// 5회 = 10 = 10 + 5 	=> 15

			sum = sum + start;
			System.out.println("sum (" + start + ") = " + sum);
			start++; // 1식 증가

		}

	}

}
