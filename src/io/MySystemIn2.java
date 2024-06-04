package io;

import java.io.IOException;

public class MySystemIn2 {

	public static void main(String[] args) {
		
		System.out.println(" 알파벳 하나를 쓰고 Enter 를 누르시오. ");
		
		
		int i;
		// 한 바이트씩 키보드의 값을 읽어라
		
		try {
			while( (i = System.in.read()) != '\n' ) { 
				System.out.println(" i : " + i);
				System.out.println(" (char)i : " + (char)i);
			}
			
			// 출력
			
			// 문자로 변환하고 싶다면 --> 컴퓨터 안에 있는 문자표를 활용(인코딩)
			System.out.println((char)i);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}// end of main

}
