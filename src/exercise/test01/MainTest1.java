package exercise.test01;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 문제 1
		// a의 참조변수로 시작해서 D의 name값을
		// 화면에 출력하시오.
		
		A a = new A();
		System.out.println(a.b.c.d.getName());
		a.b.c.d.setName("D에서 E로 바뀌었다");
		System.out.println(a.b.c.d.getName());
	}

}
