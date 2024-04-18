package basic.ch12;

public class BankAccountTest {

	public static void main(String[] args) {
		
		Bank bank1 = new Bank(500);
		Account account1 = new Account("김철수", 1011);
		Account account2 = new Account("박민수", 1012);
		Account account3 = new Account("최현수", 1013);
		Account account4 = new Account("김현수", 1014);
		Account account5 = new Account("지수", 1015);
		
		account1.bankName = bank1.bankName;
		account2.bankName = bank1.bankName;
		account3.bankName = bank1.bankName;
		account4.bankName = bank1.bankName;
		account5.bankName = bank1.bankName;
		
		account1.ViewInfo();
		account2.ViewInfo();
		account3.ViewInfo();
		account4.ViewInfo();
		account5.ViewInfo();
		
	
		
	}

}
