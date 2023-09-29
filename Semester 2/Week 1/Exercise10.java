import java.util.Scanner;
import java.io.*;

public class Exercise10
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter file name: ");
		String fileName = keyboard.nextLine();
		System.out.println("\n");

		File myFile  = new File(fileName);
		Scanner inputFile = new Scanner(myFile);

		int numberLine = 0;

		while (inputFile.hasNextLine())
		{
			inputFile.nextLine();
			numberLine++;
		}
		System.out.println("This file has " + numberLine + " lines of text.");
		inputFile.close();

	}
}