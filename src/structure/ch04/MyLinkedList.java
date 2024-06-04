package structure.ch04;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

	private Node head; // 요소의 맨 처음을 가리킴
	private int count; // 링크드 리스트의 요소 갯수를 카운트

	// 첫 생성시 노드가 없는 상태.
	public MyLinkedList() {
		head = null;
		count = 0;
	}

	// 저장된 Node 의 개수를 반환하는 메서드
	public int getCount() {
		return count;
	}

	// 새로운 노드(Node)를 하나 추가하는 메서드를 만들어 보자.
	public Node addElement(String data) {
		Node createNode = new Node(data);

		if (head == null) {
			// 맨 처음 요소를 저장하는 동작
			head = createNode;
		} else {

			// 항상 요소 찾기는 head부터 시작
			Node preNode = head;
			while (preNode.next != null) {
				preNode = preNode.next;
			}
			// 핵심 코드
			preNode.next = createNode;

		}
		count++;
		return createNode; // 임시 값
	}

	public Node removeElement(int index) {
		// 방어적 코드 작성
		if(index >= count) {
			System.out.println("잘못된 요청입니다. 현재 리스트 갯수는 " + count + " 입니다");
			return null;
		}
		
		// 맨 앞 요소를 삭제 요청시 
		// 항상 요소를 찾을 때 시작은 head 부터 시작이다.
		Node tempNode = head;
		if(index == 0) {
			// 코드 시작전 모습 [갤럭시,애플주소] => [애플,null]
			head = tempNode.next;
			// 코드 수행후 모습 [애플,null]
			
		} else {
			// 코드 시작전 모습 : position -> 2이라고 가정
			// [갤럭시,애플주소] => [애플,모토로라 주소] => [모토로라, null]
			Node preNode = null;
			for (int i = 0; i < index; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}// end of if
		count --;
		//System.out.println(position + " 번째 요소를 삭제 했습니다.");
		return tempNode; // 임시 값
	}
	
	// 전체 출력하는 기능 만들기
	public void printAll() {
		if(count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null) {
				System.out.print(" --> ");
			}
		}
		System.out.println();
	}
	
	// 지정한 위치의 노드 하나만 출력 하기
	
	public Node getNodeByIndex(int index) {
		if(index >= count) {
			System.out.println("검색 위치 오류 - 잘못된 요청");
		}
		
		Node tempNode = head;
		if(index == 0) {
			return head;
		}
		
		for (int i = 0; i < index; i++) {
			tempNode = tempNode.next;
		}
		return tempNode;
	}
	
	// 전체 삭제 기능
	public void removeAll() {
		head = null;
		count = 0;
	}

	// 테스트 코드
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addElement("갤럭시");
		linkedList.addElement("애플");
		linkedList.addElement("모토로라");
		linkedList.addElement("샤오미");
		linkedList.addElement("엘지");
		linkedList.addElement("노키아");
		linkedList.addElement("스카이");
		
		linkedList.printAll();
		linkedList.removeElement(6);
		linkedList.printAll();
		System.out.println(linkedList.getNodeByIndex(1).getData());
		linkedList.removeAll();
		linkedList.printAll();
		
		// System.out.println(linkedList.getCount());

	}// end of main

}// end of class
