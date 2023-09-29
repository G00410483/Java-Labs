import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Exercise13
{
	public static void main(String[] args)throws IOException
	{
		String comp = computerChoice();
		System.out.println(comp);
	}
	public static String computerChoice()
	{
		Random randomNumber = new Random();
		int rand = randomNumber.nextInt(3) + 1;
		String choice = "";

		if (rand == 1)
		{
			choice = "Rock";
		}
		if (rand == 2)
		{
			choice = "Paper";
		}
		if (rand == 3)
		{
			choice = "Scissors";
		}
		return choice;
	}
}