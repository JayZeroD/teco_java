package exercise;

import java.util.Scanner;

import basic.ch14.Book;

public class PhoneBookManager {

	static int LAST_SAVE_NUMBER = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PhoneBook[] pb = new PhoneBook[100];

		pb[0] = new PhoneBook("김민혁", "01011111111");
		pb[1] = new PhoneBook("알드리지", "01022222222");
		pb[2] = new PhoneBook("레너드", "01033333333");
		pb[3] = new PhoneBook("파우", "01044444444");
		LAST_SAVE_NUMBER = 4;
		
		//System.out.println(pb[0].getName());
		//System.out.println(pb[1].getName());
		//System.out.println(pb[2].getName());
		//System.out.println(pb[3].getName());
		
		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String CHANGE = "3";
		final String DELETE = "4";
		final String SEARCH_NAME = "5";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("** 메뉴 선택 **");
			System.out.println("1. 연락처 저장 2. 전화번호부 전체 조회 3. 연락처 변경 4. 연락처 삭제 5. 이름으로 찾기 0. 전화번호부 종료");
			String selectedNumber = sc.nextLine();

			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장 하기 <<");
				saving(sc,pb);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 <<");
				readAll(pb);
			} else if (selectedNumber.equals(CHANGE)) {
				System.out.println(">> 연락처 변경 <<");
				change(pb);
			} else if (selectedNumber.equals(DELETE)) {
				System.out.println(">> 연락처 삭제 <<");
				delete(pb);
			} else if (selectedNumber.equals(SEARCH_NAME)) {
				System.out.println(">> 이름으로 찾기 <<");
				readByName(sc,pb);
			} else if (selectedNumber.equals(END)) {
				System.out.println(">> 프로그램 종료 <<");
				flag = false;
			} else {
				System.out.println(">> 잘못된 선택입니다. <<");
			}
		}

	}// end of main
	
	// 저장하기

	public static void saving(Scanner sc, PhoneBook[] pb) {
		System.out.println("-------- 저장 하기 --------");
		System.out.println("저장할 이름을 입력하시오.");
		String name = sc.nextLine();
		System.out.println("저장할 연락처를 입력하시오");
		String phonenumber = sc.nextLine();
		PhoneBook pb1 = new PhoneBook(name, phonenumber);
		System.out.println("연락처가 저장 되었습니다.");

		if (LAST_SAVE_NUMBER >= pb.length) {
			System.out.println("더이상 연락처를 저장 할 공간이 없습니다.");
			return;
		}

		for (int i = 0; i < pb.length; i++) {
			if (pb[i] == null) {
				pb[i] = pb1;
				LAST_SAVE_NUMBER++;
				break;
			}
		}

		return;
	}
	
	// 전체 조회
	
	public static void readAll(PhoneBook[] pb) {
		for (int i = 0; i < pb.length; i++) {
			// 방어적 코드 작성
			if (pb[i] != null) {
				pb[i].showInfo();
			}
		}
	}
	
	// 연락처 변경하기
	
	public static void change(PhoneBook[] pb) {
		for(int i = 0; i < pb.length && pb[i] != null; i++) {			
			System.out.print(i + ". ");
			pb[i].showInfo();
		}
		System.out.println("변경하실 연락처를 선택하세요(번호 입력).");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		System.out.println("이름을 입력하시오");
		Scanner fg = new Scanner(System.in);
		String k = fg.nextLine();
		pb[j].setName(k);
		System.out.println("이름을 변경하였습니다.");
		Scanner rt = new Scanner(System.in);
		System.out.println("연락처를 입력하시오");
		String l = rt.nextLine();
		pb[j].setPhoneNumber(l);
		System.out.println("연락처를 변경하였습니다.");
		
	}
	
	// 연락처 선택 삭제
	
	public static void delete(PhoneBook[] pb) {
		System.out.println("------ 연락처 삭제하기 -------");
		for(int i = 0; i < pb.length && pb[i] != null; i++) {			
			System.out.print(i + ". ");
			pb[i].showInfo();
		}
		System.out.println("몇번을 삭제하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		pb[j] = null;
		System.out.println("연락처를 삭제하였습니다.");
	}
	
	// 이름으로 찾기
	
	public static void readByName(Scanner sc, PhoneBook[] pb) {
		System.out.println(">>>> 이름을 입력하시오. <<<<");
		String name = sc.nextLine();
		boolean isFind = false;
		
		for (int i = 0; i < pb.length; i++) {
			if (pb[i] != null && pb[i].getName().equals(name)) {
				System.out.println(pb[i].getName());
				System.out.println(pb[i].getPhoneNumber());
				isFind = true;
				break;
			} 
		}
		
		if (isFind == false) {
			System.out.println("해당 이름의 연락처는 없습니다.");
		}

	}
	

}// end of class
