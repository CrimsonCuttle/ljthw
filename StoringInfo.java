import java.util.Scanner;

public class StoringInfo
{
	public static void main( String[] args )
	{
		String name;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.println( "What's the name?" );
		name = keyboard.next();

		System.out.println( "How old?" );
		age = keyboard.nextInt();

		System.out.println( "How much do you weigh?" );
		weight = keyboard.nextDouble();

		System.out.println( "What's your annual income?" );
		income = keyboard.nextDouble();

		System.out.println( "So, you're " + name + " and you're " + age + " years old, you weigh " + weight + " pounds, and make $" + income + " a year. Not bad." );
	}
}
