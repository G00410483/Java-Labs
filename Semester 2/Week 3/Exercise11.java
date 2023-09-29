import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Exercise11
{
	public static void main(String[] args)throws IOException
	{
		String myVar = fileRead(6);
		System.out.println(myVar);
	}
	public static String fileRead(int lineNumber)throws IOException
	{

		File myFile = new File ("months.txt");
		Scanner inputFile = new Scanner(myFile);

		for (int i = 1; i <= lineNumber; i++)
		{
			String lineRead = "";
			lineRead = inputFile.nextLine();
			return lineRead;

			if (lineNumber == i)
			{
				lineRead = inputFile.nextLine();
				return lineRead;

			}
		}
		inputFile.close();

	}
}