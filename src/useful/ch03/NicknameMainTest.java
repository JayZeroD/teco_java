package useful.ch03;

public class NicknameMainTest {

	public static void main(String[] args) {
		
		Nickname nic = new Nickname();
		
		String newnic = null;
		newnic = "00123";
		
		try {
			nic.setNick(newnic);			
		} catch (NicknameException e) {
			System.out.println("미리 선정한 예외 발생");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("예상치 못한 예외 발생 " + e.getMessage());			
			e.printStackTrace();
		}
		 
		System.out.println(nic.getNick());
		
		
	}

}
