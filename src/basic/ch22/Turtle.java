package basic.ch22;

public class Turtle implements RaceParticipant{
	
	private final int speed = 2;
	
	@Override
	public String getName() {
		return "터틀맨";
	}

	@Override
	public int getSpeed() {
		return speed;
	}
	
	
	
}
