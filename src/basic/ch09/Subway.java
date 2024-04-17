package basic.ch09;

public class Subway {
	
	int lineNum;
	int passengerCount;
	int money;
	
	public Subway(int line) {
		lineNum = line;
	}
	
	
	
	public void take(int pay) {
		money += pay;
		passengerCount++;
	}
	
	
	public void showInfo() {
		System.out.println("지하철 호선 번호 : " + lineNum);
		System.out.println("지하철에 탑승해있는 승객 수 : " + passengerCount);
		System.out.println("지하철 수익금 : " + money);
	}
	
}
