// G00410483
import java.util.Scanner;

public class DavidVlasicLabExam1
{
	public static void main(String[] args)
		{

			Scanner keyboard = new Scanner(System.in);

			System.out.println("________________________________________________________________________");
			System.out.println("");
			System.out.println("   C   O   N   S   O   L   E      C   A   L   C   U   L   A   T   O   R");
			System.out.println("________________________________________________________________________");
			System.out.println("");
			String password;
			System.out.print("Input password to enter: ");
			password = keyboard.nextLine();

			if (password.equalsIgnoreCase("pass"))// if password is correct
			{
				System.out.println("");
				System.out.println("----------------WELCOME TO CALCULATOR----------------");
				System.out.println("");
				System.out.println("Enter two numbers for calculation");
				System.out.println("");
				System.out.println("-----------------------------------------------------");
				System.out.println("");

				double num1; // first number entered
				double num2; // second number entered
				char choice1; // choice of which type of calculation
				char choice2; // choice of performing another calculation
				int sum = 0; // number of calculations

				do
				{	++sum; // every time calculation is performed
					System.out.print("Enter number 1: ");
					num1 = keyboard.nextDouble();

					System.out.print("Enter number 2: ");
					num2 = keyboard.nextDouble();

					System.out.println("");
					System.out.println("What calculation do you wish to preform?");
					System.out.print("Enter A for add, S for substract, M for multiply, D for divide and R for remainder: ");
					choice1 = keyboard.next().charAt(0);

					System.out.println("");

					if (choice1 == 'a' || choice1 == 'A')
					{
						System.out.printf("			%,.2f plus %,.2f is %,.2f.\n", num1, num2, (num1+num2));
					}

					else if (choice1 == 's' || choice1 == 'S')
					{
						System.out.printf("			%,.2f minus %,.2f is %,.2f.\n", num1, num2, (num1-num2));
					}

					else if (choice1 == 'm' || choice1 == 'M')
					{
						System.out.printf("			%,.2f multiply %,.2f is %,.2f.\n", num1, num2, (num1*num2));
					}

					else if (choice1 == 'd' || choice1 == 'D')
					{

						System.out.printf("			%,.2f divide %,.2f is %,.2f.\n", num1, num2, (num1/num2));
					}
					else if (choice1 == 'r' || choice1 == 'R')
					{

						System.out.printf("			%,.2f modulus %,.2f is %,.2f.\n", num1, num2, (num1%num2));
					}
					else
					{
						--sum;// if it is not valid option sum wont't increase

						System.out.print(choice1 + " is not a valid option! ");
					}
					System.out.print("Enter Y to perform another calculation: ");
					choice2 = keyboard.next().charAt(0);
					System.out.println("-----------------------------------------------------");
					System.out.println("");

				} while (choice2 == 'y' || choice2 == 'Y');

				if (choice2 == 'n')
				{
					System.out.println("");
					System.out.println("");
					System.out.println("END OF THE PROGRAM REACHED.");
					System.out.println("The program preformed " + sum + " calculation(s).");
				}
			}

			else if (!password.equalsIgnoreCase("pass"))// if password is invalid
			{
				int sum = 0;// there is no calculations if password is invalid

				System.out.println("Invalid password entered !");
				System.out.println("-----------------------------------------------------");
				System.out.println("");
				System.out.println("");
				System.out.println("END OF THE PROGRAM REACHED.");
				System.out.println("The program preformed " + sum + " calculation(s).");
				System.out.println("-----------------------------------------------------");


			}


			}
	}
