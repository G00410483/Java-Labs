import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Exercise13
{
	public static void main(String[] args) throws IOException
	{

		File myFile  = new File("random.txt");
		Scanner inputFile = new Scanner(myFile);

		Random randomNumber = new Random();
		int rand;
		int lineCount = 1;
		rand = randomNumber.nextInt(1901);

		while (inputFile.hasNext())
		{
			String output = inputFile.nextLine();
			lineCount++;

			if (lineCount == rand)
			{
				JOptionPane.showMessageDialog(null, "Random quote of the day\n\n" + output);
			}
		}
		inputFile.close();

	}
}