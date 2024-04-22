package basic.ch12;

public class Card {
	
	// 멤버 변수, static
	public static int cardSerialNum = 1110;
	private int cardNum;
	private String userName;
	public String cardName;
	
	
	// 멤버 함수
	public Card(String userName, String cardName) {
		this.userName = userName;
		this.cardName = cardName;
		this.cardNum = Card.cardSerialNum;
		Card.cardSerialNum++;
	}
	
	// getter setter 작성

	public static int getCardSerialNum() {
		return cardSerialNum;
	}

	public static void setCardSerialNum(int cardSerialNum) {
		Card.cardSerialNum = cardSerialNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public void showInfo(){
		System.out.println("사용자 " + userName + " 의 " + cardName + " 카드번호는 " + cardNum + "입니다.");
	}
	//코드 테스트 ( 메인 함수 )
		public static void main(String[] args) {
			Card card1 = new Card("김춘식", "아멕스블랙카드");
			card1.showInfo();
			Card card2 = new Card("라이언", "카카오체크카드");
			card2.showInfo();
			Card card3 = new Card("어피치", "현대N1카드");
			card3.showInfo();
			System.out.println("다음 발급되는 카드의 카드번호는 " + (cardSerialNum) + " 입니다.");
		}
}
