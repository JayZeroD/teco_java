package useful.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
	// 메인 쓰레드
	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("demo.txt");
			// return;
		} catch (FileNotFoundException e) {
			System.out.println("catch 구문 실행!!!");
			// e.printStackTrace(); --> 오류가 발생한 시점 추적하는 메서드
		}finally {
			// 반드시 수행 되어야 하는 코드 영역
			// 심지어 return 키워드를 만나더라도 여기는 수행이 된다.
			System.out.println("finally 블록 수행");
			
			try {
				fis.close(); // 닫는 시점에 fis. <-- 객체가 생성되지 않은 경우도 존재함.
				// 예외처리 진행
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

		System.out.println("비정상 종료 되지 않았습니다.");

	}// end of main

}// end of class
