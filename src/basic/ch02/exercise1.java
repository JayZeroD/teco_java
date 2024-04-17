package basic.ch02;

public class exercise1 {

	public static void main(String[] args) {

		// 상수 선언 - 원가 , 할인률
		// 할인된 가격 계산하기 ( 비지니스 로직 )
		// 최종 가격을 정수형으로 형 변환 처리
		// 결과 출력.
		
		final double PRICE = 59.99;
		final int PERCENT = 30;
		double discount = PRICE * (100-PERCENT) * 0.01;
		
		System.out.print("원가 = " + PRICE);
		System.out.println("$");
		System.out.print("할인가 = " + (int)discount);
		System.out.println("$ (센트 단위 절상)");
		System.out.print("할인률 = " + PERCENT);
		System.out.println("%");
		
		
	}

}
