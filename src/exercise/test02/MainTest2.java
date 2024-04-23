package exercise.test02;

public class MainTest2 {

	public static void main(String[] args) {
		
		// 문제 2
		// 내부에서 객체를 생성하지 않고 외부에서 객체를
		// 주입한 후에 D에 getName을 출력하시오.
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		a.setB(b);
		b.setC(c);
		c.setD(d);
		d.setName("DDD");
		System.out.println(a.getB().getC().getD().getName());
		
	}

}
