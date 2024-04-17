package basic.ch02;

public class TriangleAreaCalculator {

	public static void main(String[] args) {
		
		// 연습문제
		// 삼각형의 넓이를 구하는 공식과 그 결과값을 출력하는 코드를 작성하시오.
		// 삼각형의 밑변 BASE , 높이 HEIGHT, 단 상수로 선언
		// 결과값은 area 변수에 저장.
		
		final int BASE = 17;
		final int HEIGHT = 14;
		double area = BASE * HEIGHT * 0.5;
		
		
		System.out.println(" 삼각형의 넓이는 = " + area);
		//String result = " 삼각형의 넓이는 = " + area;
		//System.out.println(result);
		
	}//end of main

}// end of class
