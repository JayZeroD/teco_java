package io.file.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileInputStream {

	public static void main(String[] args) {
		
		// 외부에 있는 파일 데이터를 읽으려면 input 필요
		FileInputStream in = null;
		
		try {
			
			in = new FileInputStream("a.txt");
			
			// 1단계
			// int readDAta = in.read();
			
			// 2단계
			// System.out.print((char)in.read());
			// System.out.print((char)in.read());
			// System.out.print((char)in.read());
			
			// 3단계
			// 읽을 데이터가 더이상 없다면 -1을 반환 한다.
			int readData;
			while ((readData = in.read()) != -1) {
				System.out.print((char)readData);
			}
			
			// 4단계 
			// FileInputStream(기반 스트림) - 대상에 한 바이트 씩 읽어 들이는 기능을 가진다.
			// 1byte -> -128 ~ +127  :  a -> 97 , A -> 65 , 대 --> 한글은 1바이트로 불가능
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}// end of main

}
