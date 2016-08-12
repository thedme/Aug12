package gamePlay;

import java.io.ObjectInputStream.GetField;

public class GameMath {
	private int wins = 0;
	private int loss = 0;
	private int ties = 0;
	
	public static enum gameOutcome
	{
		WIN, LOST, TIE;
	}
	
	public gameOutcome getGameOutCome(String userChoice, String computerChoice)
	{
		if(userChoice.equalsIgnoreCase("Rock")) {
			if(computerChoice.equalsIgnoreCase("Paper"))
			{
				loss++;
				return gameOutcome.LOST;
			}
			else if (computerChoice.equalsIgnoreCase("Scissor"))
			{
				wins++;
				return gameOutcome.WIN;
			}
			else if(computerChoice.equalsIgnoreCase("Rock"))
			{
				ties++;
				return gameOutcome.TIE;
			}
		}
		 if (userChoice.equalsIgnoreCase("Paper"))
		{
			if(computerChoice.equalsIgnoreCase("Rock"))
			{
				wins++;
				return gameOutcome.WIN;
		}
			else if(computerChoice.equalsIgnoreCase("Scissor"))
			{
				loss++;
				return gameOutcome.LOST;
	}
			else if(computerChoice.equalsIgnoreCase("Paper"))
			{
				ties++;
				return gameOutcome.TIE;
			}
		}
	if(userChoice.equalsIgnoreCase("Scissor"))
	{
		if(computerChoice.equalsIgnoreCase("ROCK"))
		{
			loss++;
			return gameOutcome.LOST;
		}
		else if(computerChoice.equalsIgnoreCase("PAper"))
		{
			wins++;
			return gameOutcome.WIN;
		}
		else if(computerChoice.equalsIgnoreCase(userChoice))
		{
			ties++;
			return gameOutcome.TIE;
		}
	}
		return null;
}
	
	public String getRandomChoice()
	{
		double d = Math.random();
		
		if(d<.33)
		{
			return "ROCK";
		
	}
		else if(d<.66)
		{
			return "PAPER";
		}
		else 
		{
			return "Scissor"; 
		}
		
	}
	
	public String notRandomChoice()
	{
		return "Scissor";
	}
	
	public int getWins()
	{
		return wins;
	}
	
	public int getLosses()
	{
		return loss;
	}
	public int getTies()
	{
		return ties;
	}
}
