package basic.ch13;
// import --> 가지고오다 , 수입하다
import java.util.Random;

public class LottoNumberMaker {
	
	//멤버 변수
	private String versin = "1.0.0";
	
	
	// main함수
	public static void main(String[] args) {
		
		System.out.print(makeNumber()+"\t");
		System.out.print(makeNumber()+"\t");
		System.out.print(makeNumber()+"\t");
		System.out.print(makeNumber()+"\t");
		System.out.print(makeNumber()+"\t");
		System.out.print(makeNumber()+"\t");
		
	}
	
	// 발전과제 -> 오름차순 정렬 및 
	// 반복숫자 제외 에 관해 고민해보자.
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
		// 자바 도구 -- 표준 API
		// 난수 발생기 (랜덤한 값을 만들어주는 도구)
		// static 함수 안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서!!
		//System.out.println("ver : " + versin);
		Random random = new Random();
		int rtnum = random.nextInt(45) +1;
		return rtnum;
	}
	
	
}
