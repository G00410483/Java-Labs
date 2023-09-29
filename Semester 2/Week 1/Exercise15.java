import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Exercise15
{
	public static void main(String[] args) throws IOException
	{

		File myFile  = new File("dataIn.txt");
		Scanner inputFile = new Scanner(myFile);

		String name, secondName;
		int age;

		name = inputFile.next();
		secondName = inputFile.next();
		age = inputFile.nextInt();
		System.out.println("Name: " + secondName + ", " + name + " - " +  "Age: " + (2022 - age));


		inputFile.close();

	}
}