package useful;

public class StringTest {
	
	public static void main(String[] args) {
		
		String str3 = "abc"; // 리터럴 방식
		String str4 = "abc"; // 불변
		System.out.println(System.identityHashCode(str3)); // 주소값 출력
		System.out.println(System.identityHashCode(str4));
		
		str3 = str3 + " : def " ;
		
		System.out.println(System.identityHashCode(str3)); // 주소값 출력
		
		// 리터럴 타입으로 생성한 String은 한번 생성하면 불변이다.
		
	}// end of main
	
}// end of class
