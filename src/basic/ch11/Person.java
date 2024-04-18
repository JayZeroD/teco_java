package basic.ch11;

public class Person {
		
	// this의 3가지 사용 방법
	// 1. this 는 자기 자신을 가리킨다.(인스턴스의 주소)
	// 2. 생성자에 다른 생성자를 호출할 때 사용할 수 있다.
	// 3. 자신의 주소 (참조값 또는 주소값)을 반환시킬 수 있다.
	
	// 변수  -->>  private
	private String name;
	private int age;
	private String phone;
	private String gender;
	
	// 생성자
	public Person(String name, int age) {
		// 자기자신의 멤버변수 name에 외부에서 들어오는 지역변수
		// name 을 대입한다.
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String phone) {
		// 생성자에서 다른 생성자를 호출할 수 있다. this(a,b,c);
		// this(name, age); --> 바로 위의 생성자를 호출함
		// !다른 생성자를 가장 먼저 호출하고 다른 수식을 작성해야 한다.
		// ( 생성자에서 다른생성자를 호출할시 반드시 맨윗줄! )
		this(name, age);
		//this.name = name;
		//this.age = age;
		this.phone = phone;
	}
	public Person(String name, int age, String phone, String gender) {
		this(name,age,phone);		
		//this.name = name;
		//this.age = age;
		//this.phone = phone;
		this.gender = gender;
	}
	
	// 3. 자신의 주소 (참조값 또는 주소값)을 반환시킬 수 있다.
	public Person getPerson() {
		// 자신의 주소값을 반환시킨다.
		return this;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("이름이" + this.name +" (으)로 변경되었습니다.");
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
	
	
}//end of class
