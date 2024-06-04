package structure;

public class MainTest1 {

	public static void main(String[] args) {

		TencoIntArray tencoIntArray = new TencoIntArray();
		tencoIntArray.addElement(100);
		tencoIntArray.addElement(200);
		tencoIntArray.addElement(300);
		tencoIntArray.addElement(400);
		tencoIntArray.printAll();
		
		tencoIntArray.insertElement(3, 99);
		tencoIntArray.printAll();
		
		System.out.println(tencoIntArray.getCountSize()); 
		System.out.println("--------------------------------------");
		
		System.out.println(tencoIntArray.isEmpty());
		System.out.println("--------------------------------------");
		
		tencoIntArray.removeAll();
		System.out.println(tencoIntArray.isEmpty());
		
	} // end of main

}
