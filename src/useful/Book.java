package useful;

// import java.lang.*->( * 뜻 : 다 가져온다) ;  -> 자동 선언되어 있음
/**
 * Object 클래스는 모든 클래스의 최상위 클래스이다.
 * import java.lang.*; -> 프로그램시 import 하지 않아도 자동으로 가지고 온다.
 * 자바는 단일 상속만 지원합니다, 단 Object 클래스를 제외 하고.
 * 변수앞의 final : 상수 , 메서드 앞의 final : override(재정의) 할수 없음
 * class 앞의 final : 상속 할 수 없음
 */
public class Book extends Object{
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// Object -> toString();
	
	@Override
	public String toString() {
		
		return "[" + title + ", " + author + "]";
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book);
	}// end of main
}
