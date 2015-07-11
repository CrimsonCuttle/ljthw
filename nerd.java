import java.util.Scanner;

public class nerd
{
	public static void main( String[] args ) throws InterruptedException
	{
		String nerd;
		int bird;

		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Who's a nerd?" );
		nerd = keyboard.next();

		if ( nerd.equals("bird") )
		{
			bird = 1;
			System.out.println( "That is the WORD." );
			Thread.sleep(1000);
			System.out.println( "BIRD BIRD BIRD" );
			Thread.sleep(1000);
			System.out.println( "BIRD IS THE WORD" );
			Thread.sleep(1000);
			while ( bird == 1 )
			{
				System.out.println( "BIRD" );
				Thread.sleep(500);
			}
		}
		else
		{
			System.out.println( nerd + " is a nerd. " );
		}
	}
}
