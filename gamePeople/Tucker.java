package gamePeople;

import gamePlay.GameMath;

public class Tucker extends Opponent {
	protected boolean isRandom = true;
	GameMath justTucker = new GameMath();
	String tuckerChoice = justTucker.getRandomChoice();
	
	public Tucker(String name, boolean randomThrow, boolean isRandom, GameMath justTucker, String tuckerChoice) {
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justTucker = justTucker;
		this.tuckerChoice = tuckerChoice;
	}

	public Tucker() {
		
	}

	public boolean isRandom() {
		return isRandom;
	}

	public void setRandom(boolean isRandom) {
		this.isRandom = isRandom;
	}

	public GameMath getJustTucker() {
		return justTucker;
	}

	public void setJustTucker(GameMath justTucker) {
		this.justTucker = justTucker;
	}

	public String getTuckerChoice() {
		return tuckerChoice;
	}

	public void setTuckerChoice(String tuckerChoice) {
		this.tuckerChoice = tuckerChoice;
	}
	
	
	@Override
	public void takeATurn() {
		// TODO Auto-generated method stub
		
	}
	

}
