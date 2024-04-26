package basic.ch22;

public class CompleteCalc extends Calculator {

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int substract(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1 * n2;
	}

	public void showInfo() {
		System.out.println("계산 완료");
	}

	public static void main(String[] args) {

		CompleteCalc cal1 = new CompleteCalc();
		System.out.println(cal1.add(7, 147));
		System.out.println(cal1.substract(7, 147));
		System.out.println(cal1.divide(147, 7));
		System.out.println(cal1.times(7, 147));

		System.out.println("--------------------");
		System.out.println(cal1.divide(147, 0));
		System.out.println("--------------------");
		
		((CompleteCalc)cal1).showInfo();
		// 반복문 , 제어문을 활용한다면 instanceof 연산자를 활용하자.
		if(cal1 instanceof CompleteCalc) {
			((CompleteCalc) cal1).showInfo();
		}
		cal1.showInfo();
		
	
		
	}

}
