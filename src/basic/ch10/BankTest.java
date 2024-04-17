package basic.ch10;

public class BankTest {
	// 코드의 시작점 main함수
	public static void main(String[] args) {

		Bank bank1 = new Bank();
		// bank1.name = "우리은행";
		bank1.deposit(10_000);
		int getMoney = bank1.withdraw(10_000); // ->리턴 타입이 있다

		// 신입 개발자가 실수로 멤버 변수에 접근해서 수정..
		// Bank에 돈을 넣어야 --> deposit() 기능으로 만들어져 있다.
		// bank1.balance = 100_000; -> private로 변경 후에 정보은닉 되었다.
		// 10만 5천원이 있어야 정상
		// 의도하지 않은 실수를 발생시킬 수 있다.
		bank1.deposit(100000);
		// bank1.showInfo();
		
		System.out.println(bank1.getBalance());
		int money = bank1.getBalance();
		if(money <= 200_000) {
			System.out.println("본점에 금액을 요청하시오.");
		}
		
		bank1.setName("그린은행");
		System.out.println(bank1.getName());
		bank1.setBalance(-1_000_000);
		System.out.println(bank1.getBalance());
	}// end of main

}// end of class
