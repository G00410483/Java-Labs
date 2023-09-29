import java.util.Scanner;
import java.io.*;

public class Exercise3
{
	public static void main(String[] args) throws IOException
	{

		File myFile  = new File("Quotes.txt");

		Scanner inputFile = new Scanner(myFile);

		int numberLine;

		System.out.println("Output which line?: ");
		numberLine = keyboard.nextInt();

		for (int i = 1; i <= numberLine; i++)
		{
			String myVariable = inputFile.nextLine();
			if (i == numberLine)
			{
				System.out.println(myVariable);
			}
		}

	    inputFile.close();

	}
}