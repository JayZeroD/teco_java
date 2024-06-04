package structure.ch06;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {
	
	private HashSet<String> userIDs;
	
	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();
	}
	
	// 사용자 ID 등록 기능
	// 중복시 false 등록시 true
	public boolean registerUserID(String userID) {
		return userIDs.add(userID);
	}
	
	public void run() {
		// 동작 - 스캐너 활용
		// 실행 흐름 만들기 --> while 또는 if
		// 결과 -> 정상유저 등록 
		//		-> 중복 유저, 재등록 
		
		registerUserID("김범수");
		registerUserID("나얼");
		registerUserID("박효신");
		registerUserID("이수");
		
		System.out.println("등록할 ID를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		while(registerUserID(id) == false) {
			registerUserID(id);
			System.out.println("이미 사용중인 ID 입니다 다시 입력해 주세요");
			id = sc.next();
		}
		System.out.println("ID가 등록되었습니다.");
		System.out.println("현재 등록된 ID 목록 " + userIDs);
		sc.close();
	}
	
	
	// 코드 테스트
	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();
		
	}
	
	
}
