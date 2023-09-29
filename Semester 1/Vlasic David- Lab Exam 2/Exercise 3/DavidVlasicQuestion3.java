//David Vlasic, G00410483
import java.util.Random;

public class DavidVlasicQuestion3
{
	public static void main(String[] args)
	{
		Random randomNumber = new Random();

		int random1;//Random number for card value
		int random2;//Random number for suit value

		random1 = randomNumber.nextInt(13)+1;
		random2 = randomNumber.nextInt(4)+1;

		System.out.println("This program will deal a card from a deck of 52 cards.");

		if (random2 == 1)//If suit value is Hearts
		{
			if (random1 == 1)
			{
				System.out.println("Your card is the Ace of Hearts.");
			}
			else if (random1 == 11)
			{
				System.out.println("Your card is the Jack of Hearts.");
			}
			else if (random1 == 12)
			{
				System.out.println("Your card is the Queen of Hearts.");
			}
			else if (random1 == 13)
			{
				System.out.println("Your card is the King of Hearts.");
			}
			else
			{
				System.out.println("Your card is the " + random1 + " of Hearts.");
			}
		}
		if (random2 == 2)//If suit value is Diamonds
		{
			if (random1 == 1)
			{
				System.out.println("Your card is the Ace of Diamonds.");
			}
			else if (random1 == 11)
			{
				System.out.println("Your card is the Jack of Diamonds.");
			}
			else if (random1 == 12)
			{
				System.out.println("Your card is the Queen of Diamonds.");
			}
			else if (random1 == 13)
			{
				System.out.println("Your card is the King of Diamonds.");
			}
			else
			{
				System.out.println("Your card is the " + random1 + " of Diamonds.");
			}
		}
		if (random2 == 3)//If suit value is Clubs
		{
			if (random1 == 1)
			{
				System.out.println("Your card is the Ace of Clubs.");
			}
			else if (random1 == 11)
			{
				System.out.println("Your card is the Jack of Clubs.");
			}
			else if (random1 == 12)
			{
				System.out.println("Your card is the Queen of Clubs.");
			}
			else if (random1 == 13)
			{
				System.out.println("Your card is the King of Clubs.");
			}
			else
			{
				System.out.println("Your card is the " + random1 + " of Clubs.");
			}
		}
		if (random2 == 4)//If suit value is Spades
		{
			if (random1 == 1)
			{
				System.out.println("Your card is the Ace of Spades.");
			}
			else if (random1 == 11)
			{
				System.out.println("Your card is the Jack of Spades.");
			}
			else if (random1 == 12)
			{
				System.out.println("Your card is the Queen of Spades.");
			}
			else if (random1 == 13)
			{
				System.out.println("Your card is the King of Spades.");
			}
			else
			{
				System.out.println("Your card is the " + random1 + " of Spades.");
			}
		}


	}
}
