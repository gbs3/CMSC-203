import java.util.Scanner;

public class MovieDriver 
{
	public static void main(String[] args)
	{
		char repeat;
		Scanner keyboard = new Scanner(System.in);
		Movie m1 = new Movie();
		
		do
		{
			System.out.println("Enter the name of a movie");
			m1.setTitle(keyboard.nextLine());
			m1.getTitle();
			System.out.println("Enter the rating of the movie");
			m1.setRating(keyboard.nextLine());
			m1.getRating();
			System.out.println("Enter the number of tickets sold for this movie");
			m1.setSoldTickets(keyboard.nextInt());
			m1.getSoldTickets();
			System.out.println(m1);
			System.out.println("Do you want to enter another? (y or n)");
			repeat = keyboard.next().charAt(0);
			keyboard.nextLine();
		}
		while (repeat == 'y');
		
		System.out.println("Goodbye");
		
		keyboard.close();
	}
}
