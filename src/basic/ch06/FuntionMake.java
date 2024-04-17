package basic.ch06;

public class FuntionMake {

	public static void main(String[] args) {
		
		greet("도준영");
		System.out.println("---------------------------------------");
		
		int result1 =square(5);
		int result2 =square(-8);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("---------------------------------------");
		
		boolean adult = cheakAdult(27);
		boolean child = cheakAdult(14);
		
		System.out.println(adult);
		System.out.println(child);
		System.out.println("---------------------------------------");
		
		String buho1 = signOfNumber(17);
		String buho2 = signOfNumber(-28);
		String zero = signOfNumber(0);
		
		System.out.println(buho1);
		System.out.println(buho2);
		System.out.println(zero);
		System.out.println("---------------------------------------");
		
		int max1 = findMax(17,29);
		int max2 = findMax(-19,281);
		System.out.println(max1);
		System.out.println(max2);
		
		System.out.println("---------------------------------------");
	}
	
	static void greet(String name) {
		System.out.println("안녕하세요, ["+ name + "]님!");
	}
	
	static int square(int n1) {
		int a = n1*n1;
		return a;
	}
	
	static boolean cheakAdult(int age) {
		boolean cheak = true;
		if (age >= 18 ) {
			cheak = true;
		}
		else if(age < 18 && age > 0) {
			cheak = false;
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		return cheak;
	}
	
	static String signOfNumber(int num1) {
		String sign;
		if(num1 < 0) {
			sign = "negative";
		}
		else if(num1 == 0) {
			sign = "zero";
		}
		else {
			sign = "positive";
		}
		return sign;
	}
	
	static int findMax(int a, int b) {
		int bigger = 0;
		if(a >= b) {
			bigger = a;
		}
		else {
			bigger = b;
		}
		return bigger;
	}
}
