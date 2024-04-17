package exercise;

public class Exercise1 {

	public static void main(String[] args) {

		//1. 데이터 10, 100, 100 을 변수 선언과 동시에 초기화를 
		//하고 화면에 출력해 보세요.
		
		int a = 10; //변수 선언과 동시에 초기화
		int b = 100;
		int c = 100;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//2. int ageBox 상자에 20을 담아 보세요
		
		int ageBox = 20;
		
		//2.1 ageBox 상자의 값을 30으로
		//변경하고 기존에 담겨 있던 데이터를 다른 곳으로 옮겨 보세요 
		int anotherBox = ageBox;
		ageBox = 30;
		System.out.println(ageBox);
		System.out.println(anotherBox);
		
		//3. int a = 1; int b = 3; 선언하고 
		//a와 b에 담겨 있는 값을 서로 스위칭 해보세요 
		int d = 1;
		int e = 3;
		// 값이 사라지지 않게 하기 위해서는 메모리 상자 하나를 더
		//만들어서 넣어 두면 된다.
		int temp = d;
		
		d = e;
		e = temp;
		System.out.println(d);
		System.out.println(e);
		
		
	}

}
