package starcraft.ver02;

public class Barracks {
	
	private int barracksNumber;
	private int count;
	
	public Barracks(int num){
		this.barracksNumber = num;
		count = 0;
	}
	public Marine createMarine(String name) {
		count++;
		return new Marine(name);
	}
	
	
	
	
	
	public int getBarracksNumber() {
		return barracksNumber;
	}
	public void setBarracksNumber(int barracksNumber) {
		this.barracksNumber = barracksNumber;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	
}
