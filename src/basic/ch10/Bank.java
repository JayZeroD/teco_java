package basic.ch10;

//은행
public class Bank {
	// 앞에 아무것도 없으면 default(같은 패키지 -폴더- 내에서 접근가능)
	// private ==> 해당클래스 내에서만 사용가능.
	private String name;
	private int balance;

	// 입금하다
	public void deposit(int money) {
		balance += money;
		showInfo();
	}
	

	// 출금하다
	public int withdraw(int money) {
		// 방어적 코드를 작성한다.
		if (money > balance) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance -= money;
		showInfo();
		return money;
		
	}

	// 현재 은행의 총 유보금을 출력하다.
	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balance + " 입니다.");
	}
	// 정보 은닉 후에 getter , setter 메소드를 설계 해 둘수 있다.
	// get 메소드란 단순히 객체의 상태 변수를 리턴하는 메소드이다.
	public int getBalance() {
		return this.balance;
	}
	public String getName() {
		return this.name;
	}
	
	// setter 메소드 : 멤버 변수에 접근해서 객체의 상태값을 변경하게 하는 
	// 메소드, 리턴 타입이 없음
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setBalance(int inputMoney) {
		// 방어적 코드 작성하기
		if(inputMoney < 0) {
			System.out.println("잘못된 입력입니다.");
		}
		else {
		this.balance = inputMoney;
		}
	}
	
	
	
	
	
	
	
	
	
}// end of class
