package io.file.ch02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {

	// 코드의 시작점
	public static void main(String[] args) {

		// 시간 측정을 해보자 . 시작 지점에서 현재 시간 측정
		long start = System.nanoTime(); // (더 정밀한 현재 시간 출력 = long 타입 리턴)

		// 데이터가 존재
		String data = "Hello World Everyone";

		// 1. 파일에다가 데이터를 저장 하고 싶다면(바이트 기반)
		// 자바 8버전 부터 추가 기능 제공
		// try / catch - resource -> 자동으로 자원 닫아줌

		try (FileOutputStream fos = new FileOutputStream("output.txt", false)) {
			// data(String) 가 가지고 있는 문자열들을 바이트 배열로 반환 처리

			// byte[] bytes = data.getBytes();

			byte[] bytes = { 72, 101, 108, 108, 111 }; // Hello

			System.out.println("bytes : " + bytes);
			for (int i = 0; i < bytes.length; i++) {
				System.out.println("bytes[i] : " + bytes[i]);
			}

			// 연결된 스트림을 활용해서 바이트 배열을 파일에다가 흘려 보냄
			fos.write(bytes);

			System.out.println("파일 출력 스트림을 통해서 데이터를 씀");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 동작 이해해 보기
		// 파일에 바이트 단위로 데이터를 쓰고
		// 그 파일을 열었을 떄 글자로 보이는 이유는 파일을 읽는 프로그램이
		// 파일 내에 바이트 데이터를 문자로 해석해서(문자 인코딩) 보여 주었다.

		// 현재 시간 측정 (종료 지점)
		long end = System.nanoTime();
		// 종료시간 - 시작시간( 소요 시간 )
		long duration = end - start;
		System.out.println("소요 시간 : " + duration);
		
		// 버퍼 사용시보다 소요시간이 길다
		
	}// end of main

}
