import java.util.Scanner;
import java.util.Arrays;

public class Lab2V2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		RandomNumber rand = new RandomNumber();
		
		int i = 0;
		int size = 10;
		int[] EvenGuesses = new int[size];
		int[] OddGuesses = new int[size];
		int[] Wins = new int[size];
		int[] Losses = new int[size];
		int[] ComputerNumb = new int[size];
		int[] Round = new int[size];
		String response = null;
		while (i < 10) {
			// Implementing Class
			int Numbers = rand.GetANumber_Between_1_and_10();
			ComputerNumb[i] = Numbers;
			System.out.println("Guess if the dice will be even or odd. Use 1 for odd and 2 for even.");
			int ans = input.nextInt();
			if ((ans < 1) || (ans > 2)) {
				System.out.println("Please enter a valid answer with a 1 or 2");
			} else {
				if (ans == 2) {
					EvenGuesses[i] = 1;
				} else {
					OddGuesses[i] = 1;
				}
				if (ans == Numbers) {
					response = "You are correct";
					Wins[i] = 1;
				} else {
					response = "You are NOT correct";
					Losses[i] = 1;
				}
			}
			System.out.println(response);
			Round[i] = i + 1;
			i++;
		}
		i = 0;
		while (i < 10) {
			System.out.printf("Round: %d, Even Guesses: %d, Odd Guesses: %d\n, Computer Number: %d, Wins: " + "%d\n",
					Round[i], EvenGuesses[i], OddGuesses[i], ComputerNumb[i], Wins[i]);
			i++;

		}
	}

}
