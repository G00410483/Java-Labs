// G00410483
import java.util.Scanner;

public class DavidVlasicLabExam2
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		String choiceContinue = "Yes";
		int sum = 0;

		while (choiceContinue.equalsIgnoreCase("Yes") && sum <= 3)
		{
			short choiceOption;
			double miles;
			double kilometers;
			float celsius;
			float farenheit;
			double inches;
			double milimeters;
			double euros;
			double sterling;
			String history = "";



			System.out.print("Enter option (1-8): ");
			choiceOption = keyboard.nextShort();

			switch (choiceOption)
			{
				case 1:

					System.out.println("\t\t" + choiceOption + ". Convert miles to kilometers.");
					System.out.print("\t\t\tEnter miles: ");
					miles = keyboard.nextDouble();
					System.out.println("\t\t" + miles + " miles is " + miles*1.609 + " kilometers.");
					break;


				case 2:

					System.out.println("\t\t" + choiceOption + ". Convert kilometers to miles.");
					System.out.print("\t\t\tEnter kilometers: ");
					kilometers = keyboard.nextDouble();
					System.out.println("\t\t" + kilometers + " kilometers is " + kilometers/1.609 + " miles.");
					break;

				case 3:

					System.out.println("\t\t" + choiceOption + ". Convert celsius to farentheit.");
					System.out.print("\t\t\tEnter celsius: ");
					celsius = keyboard.nextFloat();
					System.out.println("\t\t" + celsius + " celsius is " + ((celsius*1.8)+32) + " farenheit.");
					break;

				case 4:

					System.out.println("\t\t" + choiceOption + ". Convert farenheit to celsius.");
					System.out.print("\t\t\tEnter farentheit: ");
					farenheit = keyboard.nextFloat();
					System.out.println("\t\t" + farenheit + " farenheit is " + ((farenheit-32)/1.8) + " celsius.");
					break;

				case 5:

					System.out.println("\t\t" + choiceOption + ". Convert inches to milimeteres.");
					System.out.print("\t\t\tEnter inches: ");
					inches = keyboard.nextDouble();
					System.out.printf("\t\t %,.2f inches %,.2f milimeters\n" , inches, inches*25.4);
					break;

				case 6:

					System.out.println("\t\t" + choiceOption + ". Convert milimeters to inches.");
					System.out.print("\t\t\tEnter inches: ");
					milimeters = keyboard.nextDouble();
					System.out.printf("\t\t %,.2f milimeters is %,.2f inches" , milimeters, milimeters/25.4);					;
					break;

				case 7:

					System.out.println("\t\t" + choiceOption + ". Convert euros to sterling.");
					System.out.print("\t\t\tEnter euros: ");
					euros = keyboard.nextDouble();
					System.out.printf("\t\t %,.2f euros %,.2f sterlings\n" , euros, euros*0.897234);
					break;

				case 8:

					System.out.println("\t\t" + choiceOption + ". Convert sterling to euros.");
					System.out.print("\t\t\tEnter sterlings: ");
					sterling = keyboard.nextDouble();
					System.out.printf("\t\t %,.2f sterlings is %,.2f euros" , sterling, sterling/0.897234);					;
					break;

				default:
					System.out.println("That's a not a valid option. Choose from 1 to 8.");
					break;

			}

			++sum;
			System.out.println("");
			keyboard.nextLine();
			System.out.print("Continue? Enter Yes: ");
			choiceContinue = keyboard.nextLine();
			System.out.println("\n");


		}

		if (choiceContinue.equalsIgnoreCase("No") || sum >= 3)
		{
			String name;

			System.out.println("Calculations complete!");
			System.out.println("");
			System.out.print("Enter your name: ");
			name = keyboard.nextLine();


			System.out.println("End of the program reached " + name.toUpperCase());
			System.out.print("There was " + sum + " calculation(s)");
			System.out.print(name + " , the calculations were: " );
		}




	}
}