import java.util.Scanner;
import java.io.*;

public class Exercise9
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter file name: ");
		String fileName = keyboard.nextLine();
		System.out.println("\n");

		File myFile  = new File(fileName);

		Scanner inputFile = new Scanner(myFile);

		String name1, name2, name3;
		String surname1, surname2, surname3;
		Double pay1, pay2, pay3;
		Double rate1, rate2, rate3;

		name1 = inputFile.next();
		surname1 = inputFile.next();
		pay1 = inputFile.nextDouble();
		rate1 = inputFile.nextDouble();
		System.out.println(name1 + " " + surname1 + "- RAISE WILL BE: " + (pay1 * rate1)/100);
		System.out.println("\n-----------------------------\n");

		name2 = inputFile.next();
		surname2 = inputFile.next();
		pay2 = inputFile.nextDouble();
		rate2 = inputFile.nextDouble();
		System.out.println(name2 + " " + surname2 + "- RAISE WILL BE: " + (pay2 * rate2)/100);
		System.out.println("\n-----------------------------\n");

		name3 = inputFile.next();
		surname3 = inputFile.next();
		pay3 = inputFile.nextDouble();
		rate3 = inputFile.nextDouble();
		System.out.println(name3 + " " + surname3 + "- RAISE WILL BE: " + (pay3 * rate3)/100);
		System.out.println("\n-----------------------------\n");

		inputFile.close();

	}
}