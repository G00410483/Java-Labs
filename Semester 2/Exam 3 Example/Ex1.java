import java.util.Scanner;
import java.io.*;

public class Ex1
{
	public static void main (String[] args) throws IOException
	{
		String fileName;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		fileName = keyboard.nextLine();


		File myFile = new File(fileName);
		Scanner inputFile = new Scanner(myFile);

		while(inputFile.hasNext())
		{
			String content = inputFile.nextLine();
			System.out.println(content);
		}
	}
}

