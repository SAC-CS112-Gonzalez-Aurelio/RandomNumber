import java.util.Scanner;
import java.util.Arrays;


public class Week9Lab2 {
	public static void main(String[] args) {
		int Dice;
		int Comp;
		int Play = 0;
		int CountTurns = 0;
		int CountWins = 0;
		
		int CountOddGuesses = 0;
		int CountEvenGuesses = 0;
		
		String turn = "yes";
		String PlayerGuess;
		int Player = 0;

		Scanner Input = new Scanner(System.in);
		
		System.out.println("Lets play a game. The computer will roll a dice and you must guess if it will be an even or odd number");
		while (turn.toLowerCase().equals("yes")) {
		System.out.println("The computer will roll a dice now. ");
		Dice = 0 + (int) (Math.random() * 6);
		System.out.print("Now guess if the number is odd or even: ");
		PlayerGuess = Input.next();
		// 1=odd, 0=even

		if (PlayerGuess.toLowerCase().equals("odd"))
			Player = 1;
		else if (PlayerGuess.toLowerCase().equals("even"))
			Player = 0;
		{
		if (PlayerGuess.toLowerCase().equals("odd"))
			CountOddGuesses++ ;
		else if (PlayerGuess.toLowerCase().equals("even"))
			CountEvenGuesses++;
		}
		System.out.println("the number the computer rolled was:" + Dice);
		Comp = Dice % 2;
		if (Dice == 0)
			CountEvenGuesses++;
		//else
			//CountOddDice++;
		if (Player == Comp) {
			System.out.println("Congrats, that is correct!");
			CountWins++;
		} else
			System.out.println("Ohh sorry that is not correct");
		
		CountTurns++;
		//OddPercent = (CountOddDice * 100) / CountTurns;
		//EvenPercent = (CountEvenGuesses * 100) / CountTurns;
		//System.out.println("The computer number is : " + Dice);
		System.out.println("Number of odd guesses: " + CountOddGuesses);
		System.out.println("Number of even guesses: " + CountEvenGuesses);
		System.out.println("That was round number: " + CountTurns);
		//WinPercent = (CountWins * 100) / CountTurns;
		System.out.println("You have won this many games so far: " + CountWins);
		System.out.println("Would you like to play again?(yes/no): ");
		turn = Input.next();
		}
	}
}