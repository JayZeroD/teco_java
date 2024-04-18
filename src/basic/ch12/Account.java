package basic.ch12;

public class Account {

	private int accountNum;
	private int money;
	private int password;
	private String name;
	public String bankName;
	
	public Account(String name, int acNum) {
		this.name = name;
		this.accountNum = acNum;
	}
	
	public void ViewInfo(){
		System.out.println(accountNum);
		System.out.println(money);
		System.out.println(password);
		System.out.println(name);
		System.out.println(bankName);
	}
	
	
}
