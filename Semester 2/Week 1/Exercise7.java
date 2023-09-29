import java.util.Scanner;
import java.io.*;

public class Exercise7
{
	public static void main(String[] args) throws IOException
	{

		File myFile  = new File("Add_double.txt");
		Scanner inputFile = new Scanner(myFile);

		Double sum = 0.0;

		while (inputFile.hasNext())
		{
			Double output = inputFile.nextDouble();
			System.out.println(output);
			sum = sum + output;
		}
		System.out.println("TOTAL OF ALL NUMBERS IN FILE IS: " + sum);

	    inputFile.close();

	}
}