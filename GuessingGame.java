import java.util.Random;

import java.util.Scanner;

public class GuessingGame
{
	public static void main( String[] args )
	{
		Random rand = new Random();

		Scanner keyboard = new Scanner(System.in);

		int thought = rand.nextInt(100) + 1;
		int guess, loop;

		loop = 1;

		while ( loop == 1 )
		{
			System.out.print( "Guess a number between 1 and 100: " );
			guess = keyboard.nextInt();

			if ( guess > thought )	
				System.out.println( "Too high!" );
			if ( guess == thought)
			{
				System.out.println( "Correct!" );
				loop = 0;
			}
			if ( guess < thought )
				System.out.println( "Too low!" );

		}
	}
}
