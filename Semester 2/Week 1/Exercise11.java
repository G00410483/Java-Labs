import java.util.Scanner;
import java.io.*;

public class Exercise11
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter file name: ");
		String fileName = keyboard.nextLine();
		System.out.println("\n");

		File myFile  = new File(fileName);

		if (!myFile.exists())
		{
			System.out.println("No such file, exiting program.");
			System.exit(0);
		}

		Scanner inputFile = new Scanner(myFile);

		String output = inputFile.nextLine();
		System.out.println("File exists, reading the first line of the file.");
		System.out.println(output);

		inputFile.close();

	}
}