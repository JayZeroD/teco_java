package basic.ch18;

public class Computer {

	private String name;
	private int price;
	private Cpu cpu;

	public Computer() {
		cpu = new Cpu();
		cpu.setName("인텔 10세대");
	}

	public void bootComputer() {
		cpu.startCpu();
		System.out.println("부팅을 시작합니다.");
	}

	public void quitComputer() {
		cpu.stopCpu();
		System.out.println("컴퓨터를 종료합니다.");
	}

	public static void main(String[] args) {
		Computer pc1 = new Computer();
		pc1.bootComputer();
		pc1.quitComputer();
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

	public Cpu getCpu() {
		return this.cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
}
