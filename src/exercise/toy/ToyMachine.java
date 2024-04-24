package exercise.toy;

import java.util.Random;

import basic.ch20.Banana;

// 클래스 설계도
// 인형뽑기 기계 설계하기
// 내부 여러 물품들 , 사자 인형 , 곰인형 ,에어팟

// 요구 조건
// 배열을 활용해서 객체들을 담기

public class ToyMachine {
		
	public ToyMachine(Product[] products) {
		
	}
	
	public void showProducts(Product[] products) {
		for(int i = 0; i < products.length; i++) {
			if(products[i] != null) {
				System.out.println(i + "번 상품 : "+ products[i].name);
			}
		}
	}
	
	public void draw(Product[] products) {
		Random random = new Random();
		int rdnum = random.nextInt(products.length);
		if (products[rdnum] instanceof AirPot) {
			System.out.println(products[rdnum].name + " 을(를) 뽑았습니다! 축하합니다.");
			((AirPot)products[rdnum]).playAirPot();
		}
		else{
			System.out.println(products[rdnum].name + " 을(를) 뽑았습니다! 축하합니다.");
		}
		
	}

}// end of class
