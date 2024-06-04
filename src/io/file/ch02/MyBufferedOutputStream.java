package io.file.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferedOutputStream {

	public static void main(String[] args) {
		
		// 시간 측정을 해보자 . 시작 지점에서 현재 시간 측정 
		long start = System.nanoTime(); // (더 정밀한 현재 시간 출력 = long 타입 리턴)
		
		String data = "기반 스트림 + 보조 스트림 을 활용해 보자";
		
		// try - catch -resource 문법 활용
		try (
				FileOutputStream fos = new FileOutputStream("output2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				) 
		{
		// 코드 수행 부분
		byte[] bytes = data.getBytes();
		
		// 보조 스트림(버퍼)
		bos.write(bytes);
		// 간혹 버퍼에 데이터가 남아 있다면 중복된 데이터를 쓸 수 있다.
		// 한번 사용한 다음엔 플러싱을 해야 함
		bos.flush(); // flush --> 물을 내리다 .
		
		
		System.out.println("보조 스트림을 활용한 파일 출력 완료 ");
		// 기반 스트림만 사용 한 것과 보조 스트림을 함께 사용한 프로그램 간의 시간 측정을 해 보자
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 현재 시간 측정 (종료 지점)
		long end = System.nanoTime();
		// 종료시간 - 시작시간( 소요 시간 )
		long duration = end - start;
		System.out.println("소요 시간 : " + duration);
		//0.0006782초
	}// end of main

}
