package basic.ch18;

public class Cpu {

	private String name;
	private int price;

	public void startCpu() {
		System.out.println("cpu가 동작합니다");
	}

	public void stopCpu() {
		System.out.println("cpu가 멈춥니다");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
