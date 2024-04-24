package basic.ch21;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("LG 4K 27인치 240hz 모니터");
	}

	@Override
	public void typing() {
		System.out.println("무소음 키보드로 타이핑을 합니다.");
	}
}
