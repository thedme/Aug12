package gamePlay;

public final class Validation {
	public static boolean  isValidOpponent(String opponentChoice)
	{
		boolean validSelection = true;
		String[] validEntries = {"Tucker", "Beth", "Adam"};
		
		for (int i = 0; i < validEntries.length; i++) {
			if (opponentChoice.equalsIgnoreCase(validEntries[i].toString()))
			{
				validSelection = false;
			}
			
		}
		if(validSelection)
		{
			System.out.println("This is not a valid entry. Try again");
		}
			return validSelection;
	}
	public static boolean isValidWeapon(String userInput)
	{
		boolean validSelection = true;
		String[] validEntries = {"Rock", "Paper", "Scissor"};
		
		for (int i = 0; i < validEntries.length; i++) {
			if(userInput.equalsIgnoreCase(validEntries[i].toString()))
			{
				validSelection = false;
			}
		}
		if(validSelection)
		{
			System.out.println("This is not a valid entry. try again");
		}
		return validSelection;
			
		}
	public static boolean isValidEntry(String userInput)
	{
		boolean validSelection = true;
		String[] validEntries = {"Yes", "No"};
		
		for (int i = 0; i < validEntries.length; i++) {
			if (userInput.equalsIgnoreCase(validEntries[i].toString())) {
				validSelection = false;
			}
		}
		if(validSelection)
		{
			System.out.println("This is not a valid entry.");
		}
				return validSelection;
			}
				
		}


