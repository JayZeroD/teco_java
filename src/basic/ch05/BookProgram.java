package basic.ch05;

public class BookProgram {
	// 코드의 시작점
	public static void main(String[] args) {
		
		// Book 클래스를 인스턴트화 시켜 주세요 2개
		// 참조 타입 변수명은 bookBox1, bookBox2 로 지정
		Book bookBox1 = new Book();
		Book bookBox2 = new Book();
		
		// 참조 타입의 변수 안에는 실제 값이 들어가는게 
		// 아니라 주소값이 담긴다. 레퍼런스 변수(Reference Valuable)
		
		System.out.println(bookBox1);
		System.out.println(bookBox2);
		
		// Heap 메모리에 생성된 객체에 접근 해서
		// 그 해당 객체의 속성값을 넣어 보자.
		
		
		bookBox1.title = "플러터UI실전";
		bookBox1.author = "김근호";
		bookBox1.publishYear = 2022;
		bookBox1.totalPage = 230;
		
		
		System.out.println(bookBox1.title);
		System.out.println(bookBox1.author);
		System.out.println(bookBox1.publishYear);
		System.out.println(bookBox1.totalPage);
		
		// 연습문제
		// bookBox2의 클래스 인스턴스에 접근해서
		// 속성값을 넣고 콘솔창 화면에 출력하시오.
		
		
		bookBox2.title = "해리포터와 불의 잔";
		bookBox2.author = "Joan.K.Rollang";
		bookBox2.publishYear = 001101;
		bookBox2.totalPage = 301;
		
		System.out.println("책 제목 = " + bookBox2.title);
		System.out.println("저자 = " + bookBox2.author);
		System.out.println("발행일 = " + bookBox2.publishYear);
		System.out.println("쪽 수 = " + bookBox2.totalPage);
		
		
		
	}// end of main

}// end of class
