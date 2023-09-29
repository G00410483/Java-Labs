import java.util.Scanner;

public class Exercise12
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a month (1-12): ");
		int month = keyboard.nextInt();

		System.out.print("Enter a year: ");
		int year = keyboard.nextInt();

		MonthDays date = new MonthDays();
		date.setMonth(month);
		date.setYear(year);

		System.out.println(date.getNumberOfDays() + " days.");
	}
}
