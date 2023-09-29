import java.util.Scanner;
import java.util.Random;

public class Exercise18
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter month number (1-12): ");
		int month = keyboard.nextInt();

		String myVar = monthReturn(month);
		System.out.println("Number to month conversion is: " + myVar);
	}
	public static String monthReturn(int month)
	{
		switch (month)
		{
			case 1:
				String month1 = "January";
				return month1;
			case 2:
				month1 = "February";
				return month1;
			case 3:
				month1 = "March";
				return month1;
			case 4:
				month1 = "April";
				return month1;
			case 5:
				month1 = "May";
				return month1;
			case 6:
				month1 = "June";
				return month1;
			case 7:
				month1 = "July";
				return month1;
			case 8:
				month1 = "August";
				return month1;
			case 9:
				month1 = "September";
				return month1;
			default:
				month1 = "Invalid month specified";
				return month1;
		}

	}
}