package basic.ch20;

public class FruitTest {

	public static void main(String[] args) {
		
		// 다형성
		// 다양한 형태로 클래스(데이터 타입을)를 바라 볼 수 있다.
		
		Fruit fruit1 = new Banana(); // 업캐스팅된 상태
		Fruit fruit2 = new Peach(); 
		
		fruit1.shotInfo();
		fruit2.shotInfo();
		System.out.println("-------------------------");
		// 다형성을 사용하면 코드를 유연하게 작성할 수 있다.
		
		Banana Banana1 = new Banana(); // 업캐스팅된 상태
		Peach Peach1 = new Peach(); 
		Peach Peach2 = new Peach(); 
		// 배열
		Fruit[] fruits = new Fruit[3];
		fruits[0] = Banana1;
		fruits[1] = Peach1;
		fruits[2] = Peach2;
		
		fruits[0].shotInfo();
		fruits[1].shotInfo();
		
		System.out.println("-------------------------");
		
		// fruits[0] --> 바나나
		// 바나나의 속성인 origin 을 출력하시오
		// 바나나의 기능인 saleBanana()메서드를 호출하시오	
		
		//Banana bananaCasting = (Banana)fruits[0];
		//bananaCasting.origin;
		System.out.println(((Banana)fruits[0]).origin);
		((Banana)fruits[0]).saleBanana();
		System.out.println(fruits[0].price);

		System.out.println("-------------------------");
		
		// 배열은 반복문과 함께 많이 사용된다.
		
		// 0번째는 바나나 객체 --> 문제없음
		// 1번째는 복숭아 객체 --> saleBanana 기능이 없으므로 CastException에러
		// instanceof 연산자를 알아야 해결 가능
		// instanceof = 실행 시점에 객체가 특정 클래스의 인스턴스인지 확인하는 키워드
		for(int i=0; i < fruits.length; i++) {
			if(fruits[i] instanceof Banana ) {		
				((Banana)fruits[i]).saleBanana();
				fruits[i].shotInfo();
			}
			else {
				fruits[i].shotInfo();
			}
		}
		
	}//end of main

}// end of class
