import java.util.Scanner;
import java.util.Random;

public class ESPGame
{
	public static void main(String[] args)
	{
		String name;
		String description;
		String dueDate;
		String userGuess;
		int round = 1, correct = 0;
		final int ITERATIONS = 11;

		Scanner input = new Scanner(System.in);
		Random num = new Random();

		System.out.print("Enter your name: ");
		name = input.nextLine();
		System.out.print("Describe yourself: ");
		description = input.nextLine();
		System.out.print("Due Date: ");
		dueDate = input.nextLine();
		System.out.print("CSMC203 Assignment 1: Test your ESP skills!\n");

		for (int count = 0; count < ITERATIONS; count++)
		{
			int colorNum = num.nextInt(1, 6);
			String color = "Red";
			System.out.print("Round " + round + "\n\n");
			System.out.print("I am thinking of a color.\n");
			System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
			System.out.println("Enter your guess: ");
			userGuess = input.nextLine();			

			while (!userGuess.equalsIgnoreCase("Red") && !userGuess.equalsIgnoreCase("Green") && !userGuess.equalsIgnoreCase("Blue") && !userGuess.equalsIgnoreCase("Orange") && !userGuess.equalsIgnoreCase("Yellow"))
			{
				System.out.println("You entered an incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
				System.out.println("Enter your guess again:");
				userGuess = input.nextLine();
			}
			
			if (colorNum == 1)
				color = "Red";
			else if (colorNum == 2)
				color = "Green";
			else if (colorNum == 3)
				color = "Blue";
			else if (colorNum == 4)
				color = "Orange";
			else if (colorNum == 5)
				color = "Yellow";	

			System.out.print("\n\nI was thinking of " + color + ".\n");

			if (userGuess.equalsIgnoreCase(color))
			{
				correct += 1;
			}
			round++;
		}

		System.out.print("Game Over\n\n");
		System.out.println("You guessed " + correct + " out of " + ITERATIONS + " colors correctly.");
		System.out.println("User Name: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Due Date: " + dueDate);

	}
}
