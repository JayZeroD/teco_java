package basic.ch14;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char [] alphabets = new char[26];
		char ch1 = 'A';
		alphabets[0] = ch1;
		
		char ch2 = 'B';
		alphabets[1] = ch2;
		
		char ch3 = 'C';
		alphabets[2] = ch3;
		
		char ch26 = 'Z';
		alphabets[25] = ch26;
		
		System.out.println((int)alphabets[20]);
		
		// 배열은 반복문과 함께 많이 사용된다.
		int forCount = 0;
		for (int i = 0; i < alphabets.length; i++) {
			//alphabets[i];
			System.out.println(alphabets[i]);
			if (alphabets[i] != 0) {
				forCount++;				
			}
		}
		System.out.println("배열안의 요소의 갯수는? : " + forCount);
		System.out.println(alphabets[3]);
		
		
	}// end of main

}// end of class
