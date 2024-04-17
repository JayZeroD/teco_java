package basic.ch05;

public class MamberMaintest {

	public static void main(String[] args) {
		
		Member newMem1 = new Member();
		
		newMem1.name = "김철수";
		newMem1.age = 27;
		newMem1.sex = "Male";
		
		System.out.println("신규 회원 정보");
		System.out.println("이름 = " + newMem1.name);
		System.out.println("나이 = " + newMem1.age);
		System.out.println("성별 = " + newMem1.sex);
		
		
		
		
	}

}
