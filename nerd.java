import java.util.Scanner;

public class nerd
{
	public static void main( String[] args )
	{
		String nerd;

		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Who's a nerd?" );
		nerd = keyboard.next();

		System.out.println( nerd + " is a nerd." );
	}
}
