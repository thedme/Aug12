package gamePlay;
import java.util.Scanner;

import gamePeople.Adam;
import gamePeople.Beth;
import gamePeople.Tucker;
import gamePlay.GameMath.gameOutcome;



public class PlayRoshambo {
public static void main(String[] args) {
	GameMath model = new GameMath();
	String opponentThrow = null;
	
	int endGame = 0;
	while(endGame == 0)
	{
	
	String choice = model.getRandomChoice();
	
	Scanner userInput = new Scanner(System.in);
	System.out.println("Welcome to Roshambo Arena!");
	
	System.out.println("What is your name?");
	String userName = userInput.nextLine();
	
	System.out.println("Please choose your opponent");
	System.out.println("Would you like to challenge \nAdam \tBeth\tTucker?");
	
	String opponentChoice = userInput.nextLine();
	System.out.println("Would you like to throw " +"\n\tRock" + "\n\tPaper" +"\n\tScissor");
	
	String userWeapon = userInput.nextLine().toUpperCase();
	
	switch (opponentChoice.toUpperCase())
{
	case "BETH":
		Beth bethInTheArena = new Beth();
		
		opponentThrow = bethInTheArena.getBethsChoice();
		Validation beths = new Validation();
		beths.isValidOpponent(opponentThrow);
		System.out.println(userName + " picked " + userWeapon + ".\n" + opponentChoice + " picked " + opponentThrow + "'");
		break;
	case "TUCKER":
		Tucker tuckerInTheArena = new Tucker();
		Validation tucker = new Validation();
		tucker.isValidOpponent(opponentThrow);
		opponentThrow = tuckerInTheArena.getTuckerChoice();
		System.out.println(userName + " picked " + userWeapon + ".\n" + opponentChoice + " picked " + opponentThrow + "'");
		break;
	case "ADAM":
		Adam adamInTheArena = new Adam();
		Validation adam = new Validation();
		opponentThrow = adamInTheArena.getAdamsChoice();
		adam.isValidOpponent(opponentThrow);
		System.out.println(userName + " picked " + userWeapon + ".\n" + opponentChoice + " picked " + opponentThrow + "'");
		break;
	default:
		Validation t = new Validation();
		t.isValidOpponent(opponentThrow);
		System.out.println("Try again");
		break;
	}
	GameMath.gameOutcome arenaOutcome = model.getGameOutCome(userWeapon, opponentThrow);
	System.out.print(userName + "  your game ended in a ");
	System.out.println(arenaOutcome);
	
	System.out.println("\nWould you like to play again? " +"\n\ty\n\t n ");
	String endGame2 = userInput.nextLine();
	endGame2.toLowerCase();
	if(endGame2.equals("y"))
	{
		System.out.println("Game on!");
		endGame = 0;
	}
	else
	{
		System.out.println("good game!");
		endGame = 5;
	}
	}
}
}
