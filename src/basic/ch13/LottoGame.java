package basic.ch13;

public class LottoGame {

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
		//System.out.print(gameNumber3 + " \t ");
		//System.out.print(gameNumber4 + " \t ");
		//System.out.print(gameNumber5 + " \t ");
		//System.out.print(gameNumber6 + " \t ");
		//오름차순 정렬해보기
		//만약 1상자가 2상자보다 크다면 어떤 행동을 하라.
		int i = 1;
		int tmp;
		
		if (gameNumber1 > gameNumber2) {
			tmp = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = tmp;
		}
		System.out.println();
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2);
		
		
		
		
		
		
		
		
		
		
		
	}// end of main

}// end of class
