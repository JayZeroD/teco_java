package exercise.toy;

public class ToyMachineTest1 {

	public static void main(String[] args) {
		
		Product[] products1 = new Product[3];
		
		Product pd1 = new LionDool();
		Product pd2 = new AirPot();
		Product pd3 = new BearDool();
		
		
		
		products1[0] = pd1;
		products1[1] = pd2;
		products1[2] = pd3;
		
		ToyMachine toyMachine = new ToyMachine(products1);
		
		toyMachine.showProducts(products1);
		
		toyMachine.draw(products1);
		
		
		
		
		
	}

}
