package basic.ch13;

public class LottoGame3 {

	public static void main(String[] args) {
		// static 변수 -> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();
		System.out.print(gameNumber1 + " \t ");
		System.out.print(gameNumber2 + " \t ");
		System.out.print(gameNumber3 + " \t ");
		System.out.print(gameNumber4 + " \t ");
		System.out.print(gameNumber5 + " \t ");
		System.out.print(gameNumber6 + " \t ");
		
		int tmp = 0;
		for(int j = 0; j < 6; j++) {			
			if(gameNumber1 > gameNumber2) {
				tmp = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tmp;
			}
			if(gameNumber2 > gameNumber3) {
				tmp = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = tmp;
			}
			if(gameNumber3 > gameNumber4) {
				tmp = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = tmp;
			}
			if(gameNumber4 > gameNumber5) {
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
		System.out.println("-----------------------------------------------------");
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");
		
		
		
		
		
		
		
		
		
		
		
	}// end of main

}// end of class
