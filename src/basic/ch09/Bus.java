package basic.ch09;

public class Bus {

	int busNum;
	int passengerCount; // 승객 수
	int money; // 수입금
	// 강제성 부여

	public Bus(int num) {
		//객체 생성시에 제일 먼저 실행되는 부분.
		busNum = num;
	}
	
	// 승객을 태운다.
	
	public void take(int pay) {
		money += pay;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 번호 : " + busNum);
		System.out.println("버스에 탑승해있는 승객 수 : " + passengerCount);
		System.out.println("버스 수익금 : " + money);
	}
	
	
	// 엔터엔터
	
}
