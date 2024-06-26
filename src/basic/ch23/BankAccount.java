package basic.ch23;

public class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금
	public synchronized void saveMoney(int money) {

		int curruntMoney = getMoney();

		// 시간이 걸림
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setMoney(curruntMoney + money);

		System.out.println("입금 완료. 잔액 : " + getMoney());

	}

	// 출금
	public synchronized int withDraw(int money) {
		
		int curruntMoney = getMoney();
		
		synchronized (this) {
			
			
			//... 출금 = 0.5초 시간
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(curruntMoney >= money) {
				setMoney(curruntMoney - money);
				System.out.println("출금 완료. 잔액 : " + getMoney());
				return money;
			}
			else {
				System.out.println("잔액이 부족합니다.");
				return 0;
			}
			
		}
	}
}
