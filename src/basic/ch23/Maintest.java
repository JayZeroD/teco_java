package basic.ch23;

public class Maintest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		// 아버지 클래스 new
		Father father = new Father(account);
		father.start();
		// 어머니 클래스 new
		Mother mother = new Mother(account);
		mother.start();

		int resultMoney = account.getMoney();
		System.out.println(resultMoney);
	}

}
