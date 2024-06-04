package io.file.ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		
		// 스트림은 기본적으로 단방향 이다.
		// 입력 스트림, 출력 스트림 두가지가 필요하다.
		
		// 파일 경로 (복사할 대상)
		String sourceFilePath = "C:\\Users\\KDP\\Documents\\Lightshot\\a.zip";
		// 목적지 파일
		String destinationFilePath = "copy1.zip";
		
		// 소요 시간 확인
		long startTine = System.nanoTime();
		
		try (
				FileInputStream in = new FileInputStream(sourceFilePath);
				FileOutputStream out = new FileOutputStream(destinationFilePath)) {
			
				int data;
				while( (data = in.read() ) != -1 ) {
					// 파일에 출력
					out.write(data);
				}
				
				System.out.println("입력 스트림 --> 출력 스트림 --> 입력 --> 출력 의 반복 완료");
			
		} catch (Exception e) {
				
		}
		
		long endTime = System.nanoTime();
		long duration = endTime - startTine;
		
		// 나노초는 가시성이 좋지 않으니 소요시간을 초 단위로 변환 --> 포멧팅
		double seconds = duration / 1_000_000_000.0;
		// System.out.println("복사하는데 걸린 소요시간 : " + seconds + "초");
		// String 클래스에 format 메서드 사용해 보기
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds);
		// %.6f 의 의미
		// %는 포멧 지정자의 시작
		// f 지정자는 float, double 유형의 변수를 인자로 받아 처리하겠다는 의미.
		// .6 지정자는 소수점 6번째 자리까지 표기
		System.out.println(resultFormat);
		
	}

}
