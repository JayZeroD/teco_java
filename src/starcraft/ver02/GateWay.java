package starcraft.ver02;

public class GateWay {

	private int gateWayNumber;
	private int count;
	
	// 생성자
	public GateWay(int Number) {
		this.gateWayNumber = Number;
		count = 0;
	}
	public Zealot makeZealot(String name) {
		count++;
		return new Zealot(name);
	}
	
	public int getCount() {
		return count;
	}
	
	public int getGateWayNumber() {
		return gateWayNumber;
	}
	// 기능 - 질럿을 생산하는 기능을 만들어보자.

}
