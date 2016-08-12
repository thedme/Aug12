package gamePeople;

public class Opponent extends Player {
	protected boolean randomThrow = false;

	public Opponent(String name, boolean randomThrow) {
		super(name);
		this.randomThrow = randomThrow;
	}

	public Opponent() {
		
	}

	public boolean isRandomThrow() {
		return randomThrow;
	}

	public void setRandomThrow(boolean randomThrow) {
		this.randomThrow = randomThrow;
	}

	@Override
	public void takeATurn() {
		// TODO Auto-generated method stub
		
	}
	
	
}
