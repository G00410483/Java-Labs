import java.util.Scanner;
public class JavaStringCompare7
{
	public static void main (String []args)
	{
		System.out.println("HOTEL ROOM BOOKING");
		System.out.println("_______________________");

		int nights;
		double cost = 50;
		char coupon;
		double rate;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter stay duration (1 to 7 nights): ");
		nights = keyboard.nextInt();
		System.out.print("Valid coupon (y or no): ");
		coupon = keyboard.next().charAt(0);
		System.out.print("Enter discount rate: ");
		rate = keyboard.nextDouble();

		if (nights == 1)
		{
			if (coupon == 'y')
			{
			System.out.println("Cost for one night @ " + (cost-(cost*rate/100)) + " per night is " + (cost*nights-(cost*nights*rate/100)) + " euros.");
			}
			else if (coupon == 'n')
			{
			System.out.println("Cost for one night @ " + cost + " per night is " + (nights*cost) + " euros.");
			}
		}
		if (nights == 2)
		{
			if (coupon == 'y')
			{
			System.out.println("Cost for one night @ " + (cost-(cost*rate/100)) + " per night is " + (cost*nights-(cost*nights*rate/100)) + " euros.");
			}
			else if (coupon == 'n')
			{
			System.out.println("Cost for one night @ " + cost + " per night is " + (nights*cost) + " euros.");
			}
		}
		if (nights == 3)
		{
			if (coupon == 'y')
			{
			System.out.println("Cost for one night @ " + (cost-(cost*rate/100)) + " per night is " + (cost*nights-(cost*nights*rate/100)) + " euros.");
			}
			else if (coupon == 'n')
			{
			System.out.println("Cost for one night @ " + cost + " per night is " + (nights*cost) + " euros.");
			}
		}
		if (nights == 4)
		{
			if (coupon == 'y')
			{
			System.out.println("Cost for one night @ " + (cost-(cost*rate/100)) + " per night is " + (cost*nights-(cost*nights*rate/100)) + " euros.");
			}
			else if (coupon == 'n')
			{
			System.out.println("Cost for one night @ " + cost + " per night is " + (nights*cost) + " euros.");
			}
		}
		if (nights == 5)
		{
			if (coupon == 'y')
			{
			System.out.println("Cost for one night @ " + (cost-(cost*rate/100)) + " per night is " + (cost*nights-(cost*nights*rate/100)) + " euros.");
			}
			else if (coupon == 'n')
			{
			System.out.println("Cost for one night @ " + cost + " per night is " + (nights*cost) + " euros.");
			}
		}
		if (nights == 6)
		{
			if (coupon == 'y')
			{
			System.out.println("Cost for one night @ " + (cost-(cost*rate/100)) + " per night is " + (cost*nights-(cost*nights*rate/100)) + " euros.");
			}
			else if (coupon == 'n')
			{
			System.out.println("Cost for one night @ " + cost + " per night is " + (nights*cost) + " euros.");
			}
		}
		if (nights == 7)
		{
			if (coupon == 'y')
			{
			System.out.println("Cost for one night @ " + (cost-(cost*rate/100)) + " per night is " + (cost*nights-(cost*nights*rate/100)) + " euros.");
			}
			else if (coupon == 'n')
			{
			System.out.println("Cost for one night @ " + cost + " per night is " + (nights*cost) + " euros.");
			}
		}

	}
}
