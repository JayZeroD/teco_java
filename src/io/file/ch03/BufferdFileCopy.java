package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferdFileCopy {

	public static void main(String[] args) {
		// 기반 스트림 + 보조 스트림을 활용하여 파일 복사 기능을 만들고
		// 소요 시간을 측정해 보자.
		
		String sourceFilePath = "C:\\Users\\KDP\\Documents\\Lightshot\\a.zip";
		String destinationFilePath = "copy2.zip";
		
		long startTime = System.nanoTime();
		
		try (
				FileInputStream in = new FileInputStream(sourceFilePath);
				BufferedInputStream bui = new BufferedInputStream(in);
				FileOutputStream out = new FileOutputStream(destinationFilePath);
				BufferedOutputStream buo = new BufferedOutputStream(out);
				) {
			int data;
			while( (data = bui.read()) != -1) {
				buo.write(data);
			}
			buo.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		double seconds = duration / 1_000_000_000.0;  
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds);
		System.out.println(resultFormat);
		
	}

}
