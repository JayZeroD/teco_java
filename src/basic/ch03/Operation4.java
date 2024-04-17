package basic.ch03;

/*
 * 복합 대입 연산자란
 * 대입 연산자와 다른 연산자가 함께 쓰이는 것(산술 연산자)
 * 
 */

public class Operation4 {

	public static void main(String[] args) {
		
		int score = 5;
		
		score += 10;
		System.out.println("점수 확인 = " + score);
		//도전 연습 --> score += 10;
		
		score = score + 10;
		System.out.println("점수 확인 = " + score);
		
		System.out.println("-----------------------");
		
		int n1 = 100;
		// n1이라는 변수에 접근해서 기존에 있는 값에 추가로 10을  더해 주세요
		// n1 = n1 + 10;
		n1 += 10;
		System.out.println("n1 = " + n1);
		
		//!점수 두배 증가
		score *= 2;
		// score = score * 2;
		
		// !점수를 반으로 감소
		score /= 2;
		
		System.out.println("score = " + score);
		
	}

}
