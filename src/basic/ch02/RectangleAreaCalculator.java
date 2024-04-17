package basic.ch02;

public class RectangleAreaCalculator {

	public static void main(String[] args) {

		// 도전 과제 1
		// 사각형의 면적을 구하는 코드를 작성해보시오 단, 상수를 선언해서 활용하세요
		
		final double WIDTH = 27.42;
		final double HEIGHT = 14.488;
		
		double area = WIDTH * HEIGHT;
		System.out.println("사각형의 넓이는 = " + area );
		
		//문자열은 연산을 사용할 수 있습니다.
		// 문자열 + 정수 , 문자열 + 실수 ...
		// 위 연산의 결과 값은 --> 문자열로 리턴
		
		
		//사다리꼴일때는 (윗변의 길이 + 아랫변의 길이) X높이 ÷ 2
		//평행사변형일때는 = 직사각형과 같음.
		
		final float TRAPEZOIDUNDERLENGTH = 33.48f;
		final float TRAPEZOIDUPPERLENGTH = 24.77f;
		final float TRAPEZOIDUPPERHEIGHT = 42.7f;
		
		double areab = (TRAPEZOIDUNDERLENGTH + TRAPEZOIDUPPERLENGTH) * 0.5 * TRAPEZOIDUPPERHEIGHT;
		
		System.out.println("사다리꼴의 넓이는 = " + areab);
		
		
	}

}
