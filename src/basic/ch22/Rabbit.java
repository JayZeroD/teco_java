package basic.ch22;

public class Rabbit implements RaceParticipant{
	
	final int speed = 5;

	@Override
	public String getName() {
		return "토사장";
	}

	@Override
	public int getSpeed() {
		return speed;
	}
	
	
	
	
}
