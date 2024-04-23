package basic.ch16;

public class BasketBall {
	
	public String attack(String a, int b) {
		return b+a;
	}
	
	public int attack(int a, int b) {
		return a*2;
	}
	public int attack(int a, double b) {
		return a*3;
	}
	public double attack(double a, int b) {
		return a*b;
	}
	
	
}
