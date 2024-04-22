package basic.ch13;

public class LottoGame2 {

	public static void main(String[] args) {
		// static 변수 -> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
		
		// 전체 1~6까지 나온 결과값을 오름 차순으로 정렬
		// 단, 중복값은 제외
		
		// 수식을 작성해주세요.
		// 만약 if --> 반복문 사용 금지 if문 6개로 해결
		int tmp = 0;
		for(int j = 0; j < 6; j++) {			
			if(gameNumber1 > gameNumber2 && j<1) {
				tmp = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tmp;
			}
			if(gameNumber2 > gameNumber3 && j<2) {
				tmp = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = tmp;
			}
			if(gameNumber3 > gameNumber4 && j<3) {
				tmp = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = tmp;
			}
			if(gameNumber4 > gameNumber5 && j<4) {
				tmp = gameNumber4;
				gameNumber4 = gameNumber5;
				gameNumber5 = tmp;
			}
			if(gameNumber5 > gameNumber6 && j<5) {
				tmp = gameNumber5;
				gameNumber5 = gameNumber6;
				gameNumber6 = tmp;
			}
		}
		
		System.out.println();
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");
		
		
		
		
		
		
		
		
		
		
		
	}// end of main

}// end of class
