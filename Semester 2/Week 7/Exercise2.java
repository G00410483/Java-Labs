import java.util.Scanner;
import java.io.*;

public class Exercise2
{
	public static void main(String[] args)throws IOException
	{
		File file = new File("names.txt");
		Scanner inputFile = new Scanner(file);

		String[] myArray = new String[26];

		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = inputFile.nextLine();
			System.out.println(myArray[i]);
		}
		inputFile.close();
	}
}