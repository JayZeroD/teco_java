package basic.ch03;

public class Operation1 {

	public static void main(String[] args) {
		
		int intData = 1000;
		System.out.println(+intData);
		System.out.println(-intData);
		System.out.println("---------------");
		System.out.println(intData);
		//반드시 기억! 부호 연산자는 변수에 실제 값이 변경되는 것은 아니다.
		
		// 메모리 공간 안에 실제 값을 변경하려면 어떻게 해야 할까?
		// 대입 연산자와 함께 사용하여야 한다.
		intData = -intData;
		System.out.println("실제 변수안에 들어있는 값 : " + intData);
		
		
		//연습
		int oneStepDistance = 1;
		final int ZERO_POINT = 0; // 상수를 쓸때는 대문자 권장
		int curruntPosition = 0;
		
		
		//제로포인트에서 왼쪽으로 3칸 이동한 값을 출력하시오.
		//식
		curruntPosition = ZERO_POINT - (oneStepDistance * 3);
		//결과값
		System.out.println(curruntPosition);
		
		//절대값이란 어떤 수의 크기를 나타내는 것으로 그수가 0에서 얼마나 떨어져 있는지를
		//표시합니다.
		//어떤 수의 절대값은 그수가 음수인지 양수인지 상관없이 양수이다.
		//0의 절대값은 0
		
		// curruntPosition 값이 부호연산자를 통해 부호가 바뀌는데 양수이면
		// 절대값이 음수로 나와 틀린 값이 된다.
		System.out.println(-curruntPosition);
		
		//절대값을 구하는 알고리즘을 만들어야 한다.
		
		// 자바 개발자들이 이미 만들어둔 도구
		//Math math; // 수학과 관련된 코딩 시 
		System.out.println("Math 라이브러리 사용 = " + Math.abs(curruntPosition));
		
		
		
		
		
	}

}
