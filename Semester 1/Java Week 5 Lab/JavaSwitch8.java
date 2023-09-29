import java.util.Scanner;
public class JavaSwitch8
{
	public static void main(String[] args)
	{

		double num1;
		double num2;
		char operator;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		num1 = keyboard.nextDouble();
		System.out.print("Enter number 2: ");
		num2 = keyboard.nextDouble();

		System.out.print("Enter operator (a, s, d, m): ");
		operator = keyboard.next().charAt(0);


		switch (operator)
		{
			case 'a':
				System.out.println(num1 + " plus " + num2 + " is: " + (num1+num2));
				break;
			case 's':
				System.out.println(num1 + " minus " + num2 + " is: " + (num1-num2));
				break;
			case 'd':
				System.out.println(num1 + " divide " + num2 + " is: " + (num1/num2));
				break;
			case 'm':
				System.out.println(num1 + " multiply " + num2 + " is: " + (num1*num2));
		}
	}
}