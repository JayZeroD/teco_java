package basic.ch05;

public class OrderMaintest {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		
		order1.flatform = "배달의 민족";
		order1.Menu = "육회 비빔밥";
		order1.ordererName = "치킨학살자";
		
		System.out.println("주문 정보");
		System.out.println("배달 플랫폼 = " + order1.flatform);
		System.out.println("주문 메뉴 = " + order1.Menu);
		System.out.println("주문자 닉네임 = " + order1.ordererName);
		
		
		
	}

}
