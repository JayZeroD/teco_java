package basic.ch21;

public class ComputerMainTest {

	public static void main(String[] args) {
		
		Computer com1;  // 추상 클래스이지만 선언은 가능
		// com1 = New Computer(); // 추상 클래스이므로 new 생성자 사용 불가
		
		System.out.println("--------------------------");
		
		DeskTop detop1 = new DeskTop();
		detop1.display();
		detop1.typing();
		detop1.turnOn();
		detop1.turnOff();
		
		System.out.println("--------------------------");
		
		NoteBook not1; 
		// not1 = new NoteBook();
		
		System.out.println("--------------------------");
		
		MyNoteBook mynot1 = new MyNoteBook();
		mynot1.display();
		mynot1.typing();
		mynot1.turnOn();
		mynot1.turnOff();
	}

}
