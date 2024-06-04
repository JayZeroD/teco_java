package structure.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MySetTest {

	public static void main(String[] args) {

		// 계층 구조 확인
		// 업캐스팅 상태 - 컴파일 시점에는 Set계열의 타입 멤버들만 확인 가능
		Set<Integer> mSet = new HashSet<Integer>();

		HashSet<Integer> set1 = new HashSet<Integer>();

		// 요소 추가 방법
		set1.add(1);
		set1.add(1); // 중복값 발생 - > 무시
		set1.add(2);
		set1.add(3);
		set1.add(3); // 중복값 발생 - > 무시

		System.out.println(set1.size());

		// 요소 제거 ( 요소 -> 값을 넣음 )
		set1.remove(3);
		System.out.println(set1);

		// set 계열은 순서를 보장하지 않음
		for (int i = 0; i < set1.size(); i++) {
			// 횟수 만큼 반복은 한다.
			// set1[i] ==> set 계열은 인덱스 개념이 없다.
		}

		for (Integer mI : set1) {
			System.out.println("요소 값 추출 " + mI);
		}

		// while (set1.size() < 10) {
		// // set에 어떻게 접근할까?
		// set1.get()
		// }

		// 반복자를 활용해서 요소 순회를 만들 수 있다.
		Iterator<Integer> iter = set1.iterator();
		while (iter.hasNext()) {
			System.out.println("값 확인 " + iter.next());
		}

		HashSet<Integer> lottoNumberSet = new HashSet<Integer>();

		int whileCount = 0;
		while (lottoNumberSet.size() < 6) {
			lottoNumberSet.add(getRandomNumber());
			whileCount++;
		}
		System.out.println("로또 값 확인 " + lottoNumberSet);
		System.out.println("반복 횟수 " + whileCount);
	}// end of main

	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45) + 1;
	}

}// end of class
