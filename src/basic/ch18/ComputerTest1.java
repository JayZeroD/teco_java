package basic.ch18;

public class ComputerTest1 {

	public static void main(String[] args) {

		Computer computer = new Computer();
		
		Cpu cpu = new Cpu();
		cpu.setName("AMD");
		computer.setCpu(cpu);
		
		System.out.println(cpu.getName());
		
	}

}
