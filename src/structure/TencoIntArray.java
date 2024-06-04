package structure;

/**
 * 배열을 활용 클래스를 설계 물론 --> 이미 자바 표준 API 개발자들이 잘 만들어 준 클래스들이 존재 한다. 하지만 직접 기능을 확장해서
 * 만들어 보자.
 */
public class TencoIntArray {

	// 기능 설계

	int[] intArr;
	int count; // 배열안의 요소 숫자를 관리.
	public final int ARRAY_SIZE;
	public static final int ERROR_NUM = -99999999;

	public TencoIntArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}

	public TencoIntArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}

	// 기능 설계
	// 배열 요소에 제일 뒤의 값을 추가하는 기능
	public void addElement(int inputData) {
		// 방어적 코드필요
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return; // 실행의 제어권을 반납
		}
		intArr[count] = inputData;
		count++;
	}

	// 지정한 인덱스 번호의 요소를 꺼내기

	public int getElement(int position) {

		// 방어적 코드1
		if (position < 0 || position > count - 1) {
			System.out.println("위치 검색 오류. 현재 리스트의 갯수는 " + count + "개 입니다.");
			return ERROR_NUM;
		}
		int result = intArr[position];

		return result;
	}

	// 요소를 전체 출력하는 기능 만들어 주기
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + "\t");
		}
		System.out.println();
		System.out.println("------------------------------------------");
	}

	// 전체 삭제하는 기능
	public void removeAll() {
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 0;
		}
		// 요소의 개수 상태를 항상 관리하고 처리해야 한다.
		count = 0;
	}

	// 배열의 크기가 아닌 현재 요소의 갯수를 반환
	public int getCountSize() {
		return count;
	}

	// 현재 요소가 하나도 없는 상태이다.
	public boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	// 배열의 지정한 인덱스 위치에 값을 삽입하기
	public void insertElement(int position, int inputData) {

		// 방어적 코드 작성
		if (count >= ARRAY_SIZE) {
			System.out.println("메모리 공간이 가득 찼습니다.");
			return;
		}

		// 방어적 코드 2
		if (position < 0 || position > ARRAY_SIZE) {
			// 범위를 벗어남
			System.out.println("지정한 인덱스 번호가 잘못 되었습니다.");
			return;
		}
		// 요청값 : position -> 3
		// [11, 12, 13, 14, 15] ==> [ 11, 12, 13 ,[] , 14, 15]
		for (int i = count - 1; i >= position; i--) {
			intArr[i + 1] = intArr[i]; // 한칸식 뒤로 밀기
			// intArr[5] = 15; 수행1
			// intArr[4] = 14; 수행2

		}

		intArr[position] = inputData;
		count++;
	}
	
	// 지정한 인덱스 번호의 요소를 삭제하기
	public void removeElement(int position) {
		if(isEmpty() == true || intArr[position] == 0) {
			System.out.println("삭제할 요소가 없습니다.");
		}
		if(position < 0 || position >= count) {
			System.out.println("요청한 위치가 잘못 되었습니다.");
		}
		
		// intArr[position];
		// [100] [200] [300] [400] -> position = 0
		// [200] [300] [400]
		
		for (int i = position; i < count; i++) {
			intArr[i] = intArr[i+1];
		}
		count--;
		
		
	}
}
