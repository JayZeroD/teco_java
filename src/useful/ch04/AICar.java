package useful.ch04;

public class AICar extends Car{

	@Override
	void drive() {
		System.out.println("테슬라 오토파일럿 목적지 설정");
		System.out.println("자율주행을 시작합니다.");
		
	}

	@Override
	void stop() {
		System.out.println("전방에 장애물을 감지하였습니다.");
		System.out.println("AEB가 작동하였습니다.");
	}

}
