import java.util.Scanner;

public class Exercise9
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the employee's name: ");
		String name = keyboard.nextLine();

		System.out.print("Enter the employee's ID number: ");
		int idNumber = keyboard.nextInt();

		System.out.print("Enter the employee's hourly pay rate: ");
		double payRate = keyboard.nextDouble();

		System.out.print("Enter the number of hours worked by this employee: ");
		int hoursWorked = keyboard.nextInt();

		Payroll employee1 = new Payroll();
		employee1.setPayroll(name, idNumber, payRate, hoursWorked);

		System.out.println("\n\nEmployee Payroll data:");
		System.out.println("Name: " + employee1.getName());
		System.out.println("Hourly pay rate: " + employee1.getpayRate());
		System.out.println("Hours worked this week: " + employee1.gethoursWorked());
		System.out.println("Gross pay: " + employee1.grossPay());



	}
}
