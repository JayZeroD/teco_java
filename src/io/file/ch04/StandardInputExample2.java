package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//문자 기반 스트림 + 보조 문자 기반 스트림 확인
//현재 프로그램 -> 한줄 입력시 종료됨
//여러줄을 반복적으로 동작할 수 있도록 기능을 추가하기.
public class StandardInputExample2 {

	public static void main(String[] args) {

		List<String> lines = new ArrayList<String>();

		System.out.println("여러 줄의 텍스트를 입력하세요");
		System.out.println("입력을 종료하려면 공백을 치세요");
		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용 한다.

		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr)) {

			// isr -> 한 문자식 읽는 기능 read()를 가지고 있다.
			// br -> 한번에 한 라인식 읽을 수 있는 기능을 가지고 있다.
			// System.out.println("더 많은 텍스트를 입력 하세요 (한 줄 단위) -> 엔터, 종료하고 싶다면 문자 없이 엔터만
			// 치세요.");
			String line;
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				lines.add(line);
				// System.out.println("입력 확인 : " + line);
			}

			for (String data : lines) {
				System.out.println(data);
			}

			System.out.println("프로그램이 종료되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
