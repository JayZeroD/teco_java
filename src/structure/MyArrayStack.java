package structure;

public class MyArrayStack {

	int top; // 스택의 최상위 요소를 가리킴
	TencoIntArray arrayStack;

	public MyArrayStack() {
		top = 0; // 스택 포인터 초기화
		arrayStack = new TencoIntArray(); // 10칸짜리 배열 생성
	}

	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new TencoIntArray(size);
	}

	// 스택의 크기(요소갯수)를 반환
	public int getSize() {
		return top;
	}

	// 스택이 비어있는지 확인
	public boolean isEmpty() {
		return top == 0;
	}

	// 스택의 요소가 가득 찼는지 확인
	public boolean isFull() {
		return top == arrayStack.ARRAY_SIZE;
	}

	// 스택의 모든 요소를 출력
	public void printAll() {
		arrayStack.printAll();
	}

	// 스택에 데이터를 추가하는 기능
	public void push(int data) {
		// 방어적 코드 작성
		if (isFull()) {
			System.out.println("메모리가 가득 찼습니다.");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}

	// 스택에서 데이터를 제거하는 메서드
	public int pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return arrayStack.ERROR_NUM;
		}
		int result = arrayStack.getElement(top-1);		
		System.out.println(result);
		arrayStack.removeElement(top - 1);
		top--;
		return result;
	}

	// 스택의 최상위 요소를 반환하지만 데이터는 제거 하지 않음
	public int peek() {
		if (top == 0) {
			System.out.println("stack is empty");
			return TencoIntArray.ERROR_NUM;
		}
		return arrayStack.getElement(top - 1);
	}

	// 코드 테스트
	public static void main(String[] args) {

		MyArrayStack stack = new MyArrayStack();
		stack.push(100);
		stack.push(200);
		stack.push(300);

		// 전체 출력
		// stack.printAll();
		// --> pop의 제거된 요소를 반환할 수 있게 코드를 수정하라.
		stack.pop();
		stack.printAll();
		//System.out.println(stack.peek());
		//System.out.println("------------------------");
		//stack.printAll();

	} // end of main

}
