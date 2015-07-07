import java.util.Scanner;

public class WeaselOrNotBetter
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String word;
		boolean yep, nope;

		System.out.println( "Type the word \"weasel\", please." );
		word = keyboard.next();

		if(word.equals("weasel"))
		{
			System.out.println( "Thank you!" );
		}
		else
		{
			System.out.println( "C'mon now, was that really necessary?" );
		}
	}
}
