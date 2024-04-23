package basic.ch18;

public class Car {

	String name;
	int price;
	public Engine engine; // 포함관계 composition 관계 , 상속 사용 금지
	
	public Car() {
		// 포함관계 - Composition
		// 객체안에 필요 객체를 직접 생성할 경우
		// 포함관계 (Composition)라고 합니다.  
		engine = new Engine();
		// Car 라는 객체가 생성이 될 때
		// Engine 객체도 함께 생성이 된다.
	}
	
	public void startCar() {
		engine.start();
		System.out.println("자동차가 출발합니다.");
	}
	
	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈춥니다.");
	}
	
}
