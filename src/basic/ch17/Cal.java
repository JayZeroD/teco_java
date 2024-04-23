package basic.ch17;

public class Cal {

	public int sum(int a, int b) {
		return a + b;
	}
	
	public Cal() {
		System.out.println(" Cal() 부모 생성자 호출 ");
	}
	
	public int multiply(int c, int d) {
		System.out.println("2. 호출");
		System.out.println("여기는 부모 클래스 메서드 입니다.");
		return c * d;
	}
	
	
	// 코드 테스트
	public static void main(String[] args) {
		
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5 , 3));
		System.out.println(cal2.minus(10 , 3));
		System.out.println(cal2.multiply(10, 0));
		
	}

}

class Cal2 extends Cal {

	public int minus(int a, int b) {
		return a - b;
	}
	
	public Cal2() {
		System.out.println(" Cal2() 자식 생성자 호출 ");
	}
	
//	// 부모 코드의 기능을 변경하고 싶다면 --> 재정의
//	// 오버라이드 처리 한다.
//	// 오버라이드 란?
//	// 부모 코드의 메서드를 동일하게 가져와서 재정의 
//	
//	public int multiply(int c, int d) {
//		System.out.println(" 자식 클래스에서 호출 된 multiply 메서드입니다. ");
//		// 논리합 || a or b 둘중에 하나라도 true 이면 true 이다.
//		if(c == 0 || d == 0) {
//			System.out.println("0을 입력하지 마시오.");
//			break;	
//		}
//		return c * d;
//	}
	
	// 생성자 호출 시 상속관계가 있다면 먼저 부모 클래스부터 생성 후
	// 자식 클래스 생성
	
	@Override	// <-- 애노테이션, 어노테이션 : 주석 + 힌트
	public int multiply(int c, int d) {
		System.out.println("1. 호출");
		return super.multiply(c, d);
	}
	
	
}

