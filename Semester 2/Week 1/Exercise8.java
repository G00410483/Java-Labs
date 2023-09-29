import java.util.Scanner;
import java.io.*;

public class Exercise8
{
	public static void main(String[] args) throws IOException
	{

		File myFile  = new File("Temp.txt");

		Scanner inputFile = new Scanner(myFile);

		String day1, day2, day3;
		float temp1, temp2, temp3;

		day1 = inputFile.next();
		temp1 = inputFile.nextFloat();
		System.out.println("DAY 1:\t" + day1 + " - " + "TEMPERATURE: " + temp1 + "\n");

		day2 = inputFile.next();
		temp2 = inputFile.nextFloat();
		System.out.println("DAY 2:\t" + day2 + " - " + "TEMPERATURE: " + temp2 + "\n");

		day3 = inputFile.next();
		temp3 = inputFile.nextFloat();
		System.out.println("DAY 3:\t" + day3 + " - " + "TEMPERATURE: " + temp3 + "\n");


	    inputFile.close();

	}
}