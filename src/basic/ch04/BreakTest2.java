package basic.ch04;

public class BreakTest2 {
	// 코드의 시작점
	public static void main(String[] args) {

		// 중간에 멈추는 break 문
		// 소수 7이면 반복문을 멈추어라
		int i = 1;
		while(i < 11) {
			//단독 if 구문은 실행이 될 수도 있고 안될 수도 있다.			
			if (i % 7 == 0) {
				//중간에 멈추어라
				break;
			}
			System.out.println("i의 값 = " + i);
			i++;
			
			

		}

	}// end of main

} // end of class
