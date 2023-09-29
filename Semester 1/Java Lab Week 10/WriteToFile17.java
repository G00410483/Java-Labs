import java.io.*;
import java.util.Random;

public class WriteToFile17
{
	public static void main(String[] args) throws IOException
	{
		int random;

		Random randomNumber = new Random();
		random = randomNumber.nextInt(9999) + 1001;

		PrintWriter outputFile = new PrintWriter("A" + random + ".txt");

		outputFile.println("Name of this file is A" + random);
		outputFile.close();
	}
}