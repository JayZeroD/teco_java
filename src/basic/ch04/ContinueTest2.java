package basic.ch04;

public class ContinueTest2 {

	public static void main(String[] args) {

		// 화면에 1부터 100까지의 숫자 중 3의 배수를 출력하시오.

		// 1~100 -> 반복적인 패턴 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요.
		// 반복문은 for문 사용
		int i = 1;
		//풀이 1
//		while (i < 101) {
//			
//			if (i % 3 == 0) {
//				System.out.println(" i의 값 = " + i);
//			}
//			i++; // 식 사용하기 ( 무한 반복 예방 )
//		}

		//풀이 2 - 특정 조건이 되었을 때 반복문을 멈추어라
		boolean flag = true;
		while(flag) {
			if ( i == 100 ) {
//				flag = false;
				break;
			}
			if ( i % 3 == 0) {
				System.out.println("3의 배수 : "+ i);
			}
			i++;
		}
		
	}// end of main

}// end of class
