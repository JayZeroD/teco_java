package basic.ch14;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		String[] names = new String[5]; // 5칸짜리 메모리 공간 할당
		
		// 생성 - C
		names[0] = "김씨"; 
		names[1] = "나씨"; 
		names[2] = "박씨"; 
		//names[3] = null 
		//names[4] = null 
				
		
		// 조회 - Read 
		System.out.println(names); // 주소값
		System.out.println(names[0]);
		System.out.println(names[1]);
		//System.out.println(names[5]); // 중간에 오류 발생시 pg 종료
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		//System.out.println(names[5]); // pg 오류 발생 -> 인덱스 범위 초과
		
		
		// 수정 - Update 
		names[0] = "Mr.Kim";
		names[1] = "Mr.Nah";
		names[2] = "Mr.Park";
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		// 삭제 - Delete
		names[0] = null;		
		names[1] = null;		
		names[2] = null;		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		// 자바에서 null 값은 할당 되지 않은 상태를 의미한다.
		// Object 타입( 대문자로 쓰는 것들 ) 에서 사용 가능.
		
		// 1단계
		// 배열의 길이와 인덱스 길이에 대한 이해 --> 인덱스의 길이는 배열의 길이 -1
		System.out.println("배열의 크기 : " + names.length);
		System.out.println("인덱스의 크기(n-1) : " + (names.length-1));
		
		// 문제2
		// 배열의 크기가 50개이면 인덱스의 길이는 49
		// 배열의 크기가 100개이면 인덱스의 길이는 99
		// 배열의 크기가 375개이면 인덱스의 길이는 374
		// n-1
		
	}// end of main

}// end of class
