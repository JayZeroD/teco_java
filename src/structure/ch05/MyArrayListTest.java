package structure.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import basic.ch22.Student;

public class MyArrayListTest {

	// 메인 쓰레드
	public static void main(String[] args) {

		List mList; // 리스트 인터페이스 계열

		// ArrayList 클래스의 인스턴스화 처리
		ArrayList list = new ArrayList();
		// 제네릭 문법은 추후 학습
		// 제네릭은 타입의 명시화이다.
		ArrayList<Integer> nums = new ArrayList<Integer>();
		// 변수의 선언과 동시에 초기화 -- > 값이 들어가 있는 상태인가? - X
		// 값을 동시에 추가 하고 싶다면
		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<String> vocanulary = new ArrayList<String>();
		ArrayList<Student> members = new ArrayList<>(); // 뒤 생략가능 , 추론방식

		// 클래스의 정의된 기능을 알아 보자.
		list.add(3);
		list.add(null);
		list.add(1, 10); // -> add(1,10)은 인덱스 1번에 10을 삽입 , 기존 요소는 뒤로 자동 이동
		System.out.println("값 추가 확인 : " + list);
		Student student = new Student("홍박사");
		System.out.println(student);
		// 값 삭제

		list.remove(2);
		System.out.println("값 삭제 확인 : " + list);

		// 전체 삭제
		// list.clear();
		System.out.println("전체 삭제 확인 : " + list);

		// 리스트 사이즈 확인 (요소의 갯수, 사이즈 개념)
		System.out.println(list.size());

		// 하나의 요소를 꺼내는 방법
		try {
			System.out.println(list.get(0));
		} catch (Exception e) {
			System.out.println("프로그램이 종료 되지 않게 처리.");
		}

		// ArrayList 와 반복문의 활용
		nums = list; // 복사 개념 -> 주소를 변경한것 // 얕은 복사 개념!
		System.out.println(list);
		System.out.println("---------------------");

		list.add(10000); // 리스트에 애드
		System.out.println(nums); // 리스트에 애드해도 넘스의주소가 리스트를
		// 보고 있기 때문에 넘스를 출력해도 10000이 추가된 값이 출력됨

		//for (Integer i : list) {} <== 리스트는 컴파일 시점에 object타입으로 인식
		for (Integer i : nums) {
			System.out.println(" i : " + i);
		}
		
		// ArrayList 안에 값이 포함되어 있는가
		System.out.println("3이 nums 리스트에 존재 하는가? --> " + nums.contains(3));
		System.out.println("500이 nums 리스트에 존재 하는가? --> " + nums.contains(500));
		
		// 요소의 위치(index) 확인
		System.out.println("요소 3이 몇 번째 인덱스에 위치 합니까? " + nums.indexOf(3) + "번째");
		System.out.println("요소 3이 몇 번째 인덱스에 위치 합니까? " + nums.indexOf(10) + "번째");
		System.out.println("요소 3이 몇 번째 인덱스에 위치 합니까? " + nums.indexOf(50000) + "번째"); 
		// 값이 없다면 -1 반환
		
		// Iterator 요소 순회(반복자)
		Iterator<Integer> iter = nums.iterator();
		while(iter.hasNext()) {
			System.out.println("while 을 활용하는 방법 : " + iter.next());
		}
		
		// 배열 , ArrayList
		
		
	}// end of main

}// end of class
