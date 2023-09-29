import java.util.Scanner;
import java.io.*;

public class Exercise6
{
	public static void main(String[] args) throws IOException
	{

		File myFile  = new File("Add_int.txt");
		Scanner inputFile = new Scanner(myFile);

		int sum = 0;

		while (inputFile.hasNext())
		{
			int output = inputFile.nextInt();
			System.out.println(output);
			sum = sum + output;
		}
		System.out.println("TOTAL OF ALL NUMBERS IN FILE IS: " + sum);

	    inputFile.close();

	}
}