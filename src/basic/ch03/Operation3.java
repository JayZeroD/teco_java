package basic.ch03;

/*
 * 증감,감소 연산자
 * 변수에 접근해서 그 값을 조직 1 증가 또는 1 감소 시킨다.
 * 단항 연산자
 * 
 * 
 */

public class Operation3 {

	public static void main(String[] args) {

		int value = 1;
		//value ++;
		++value;
		System.out.println(value);
		
		//변수에 접근해서 1 감소 시키기
		
		int value2 = 1;
		value2--;
		System.out.println(value2);
		
		//증감 연산자가 변수 뒤에 올때 ( 후위 연산자 ) 
		int intData1 = 10;
		int resultData;
		
		// 후위 연산자는 ; (세미콜론) 기준으로 동작 합니다.
		// 11 = <--  10 + 1
		
		resultData = intData1++;
		System.out.println(resultData); // --> 10 출력
		System.out.println(intData1); // --> 11 출력 - ;세미콜론 기준으로 끝난 후 변수에 접근해서
		// 1을 증가
		
		//--> 증감 연산자가 변수앞에 오는 전위 연산자로 사용을 추천
		
		int intData2 = 100;
		int resultData2;
		
		resultData2 = ++intData2;
		System.out.println(resultData2); // 101
		System.out.println(intData2); // 101
		
		// 증감 연산자는 변수의 값을 1증가시킬때 사용 
		// 항의 앞,뒤 위치에 따라 연산의 순서가 다름.
		
		
	}

}
