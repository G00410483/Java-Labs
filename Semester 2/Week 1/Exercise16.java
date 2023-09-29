import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Exercise16
{
	public static void main(String[] args) throws IOException
	{

		File myFile  = new File("dataInMulti.txt");
		Scanner inputFile = new Scanner(myFile);

		String name, secondName;
		int age;

		while (inputFile.hasNext())
		{
			name = inputFile.next();
			secondName = inputFile.next();
			age = inputFile.nextInt();
			System.out.println("Name: " + secondName + ", " + name + " - " +  "Age: " + (2022 - age) + "\n\n");
		}


		inputFile.close();

	}
}