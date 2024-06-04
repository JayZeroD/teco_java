package io.file.ch01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MyBufferdInputStream {

	public static void main(String[] args) {

		// 보조 스트림의 사용 -> 기반 스트림이 반드시 필요하다
		FileInputStream fin = null;
		BufferedInputStream bfin = null;
		// 기반 스트림
		try {
			// 기반 스트림
			fin = new FileInputStream("a.txt");
			// 보조 스트림(기반스트림)
			bfin = new BufferedInputStream(fin);

			int data;
			while ((data = bfin.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// 리소스 자원 정리 -> 반대로 -> 자원을 열였을 때의 역순으로 닫아 주면 된다
			if (bfin != null) {
				try {
					bfin.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
}// end of class
