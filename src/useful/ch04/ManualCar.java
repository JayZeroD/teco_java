package useful.ch04;

public class ManualCar extends Car{

	@Override
	void drive() {
		System.out.println("사람이 운전을 합니다");
		System.out.println("기어를 넣고 출발을 합니다.");
	}

	@Override
	void stop() {
		System.out.println("보행자를 발견하고 브레이크를 밟습니다.");
		System.out.println("자동차가 멈춥니다.");
	}

}
