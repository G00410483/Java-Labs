import java.io.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class Question4
{
	public static void main(String[] args) throws IOException
	{

		Random randomNumber = new Random();

		JOptionPane.showMessageDialog(null, "\tWelcome to the \n------------------\n\tJAVA\n\tHOTEL\n------------------\n\tGUEST CHECKOUT\n\tBILLING SYSTEM\n------------------", "Messege", JOptionPane.INFORMATION_MESSAGE);

		String name = "";
		String surname = "";
		String nights;
		int numberNights;
		int total = 0;
		int rand;
		int choice1;
		int choice2 = 0;
		String charge;
		String extras;
		double extraCharge = 0;
		String output = "";
		String history = "";
		double totalAll = 0;
		int numberInvoice = 0;
		String invoice = "";

		while (choice2 == 0)
		{
			name = JOptionPane.showInputDialog("Enter your first name:");
			surname = JOptionPane.showInputDialog("Enter your surname:");
			nights = JOptionPane.showInputDialog("How many nights was your stay:");
			numberNights = Integer.parseInt(nights);

			numberInvoice++;

			if (numberNights == 1)
			{
				total = 100;
			}
			else if (numberNights == 2)
			{
				total = 180;
			}
			else if (numberNights == 3)
			{
				total = 240;
			}
			else if (numberNights >= 4)
			{
				total = 70 * numberNights;
			}

			rand = randomNumber.nextInt(5500) + 5000;

			invoice = "JH-" + rand;
			totalAll = totalAll + total + extraCharge;

			JOptionPane.showMessageDialog(null, "------------------\n\tJAVA\n\tHOTEL\n------------------\n\tBooking system\n\nNAME: " + name + " " + surname + "\n\nNIGHTS: " + numberNights + "\n\nTOTAL COST: " + total + "\n\nINVOICE NUMBER: " + invoice, "Messege", JOptionPane.INFORMATION_MESSAGE);

			JOptionPane.showMessageDialog(null, "\tCreating invoice for this stay...\n\nFILENAME: " + name + surname + ".txt", "Messege", JOptionPane.INFORMATION_MESSAGE);

			output = "-------------THE JAVA HOTEL-------------\n------------CUSTOMER INVOICE------------\n\nINVOICE NUMBER: " + invoice + "\nNAME: " + name + " " + surname + "\nSTAY DURATION: " + numberNights + "\n\nTOTAL COST: " + total;

			PrintWriter outputFile = new PrintWriter(name + surname + ".txt");
			outputFile.println(output);

			choice1 = JOptionPane.showConfirmDialog(null, "ADD EXTRAS?\n(Drinks, food, room service, mini- bar)", "Choose an Option", JOptionPane.YES_NO_CANCEL_OPTION);

			if (choice1 == 0)
			{
				charge = JOptionPane.showInputDialog("Enter extra charges for room:");
				extraCharge = Double.parseDouble(charge);

				extras = "\n-------------EXTRAS-------------\nEXTRAS:\nEXTRAS\t\t\t\t" + extraCharge + "\nTOTAL INCLUDING EXTRAS:\t\t" + (total+extraCharge);
				FileWriter fwriter = new FileWriter(name + surname +".txt", true);
				outputFile.println(extras);
			}
			else if (choice1 == 1)
			{
				extraCharge = 0;

			}

			history = history + "Invoice " + numberInvoice + " - Invoice number " + invoice + " Customer name: " + name + " " + surname + " - TOTAL CHARGE: " + (total+extraCharge) + "\n";
			JOptionPane.showMessageDialog(null, "INVOICE CREATED FOR " + name + " " + surname, "Window Title goes here", JOptionPane.QUESTION_MESSAGE);
			choice2 = JOptionPane.showConfirmDialog(null, "INVOICE CREATED FOR " + name + " " + surname + "\n\nWOULD YOU LIKE TO CREATE ANOTHER INVOICE", "Choose an Option", JOptionPane.YES_NO_CANCEL_OPTION);
			JOptionPane.showMessageDialog(null, "PROGRAM COMPLETE! LOGFILE GENERATED.", "Messege", JOptionPane.INFORMATION_MESSAGE);

			outputFile.close();


		}
			PrintWriter outputFile = new PrintWriter("Logfile.txt");
			outputFile.println("LOG FILE RECORD OF INVOICES PROCESSED:\n\n");
			outputFile.println(history);
			outputFile.println("\nTOTAL OF ALL STAYS: \t" + totalAll);
			outputFile.close();

			System.out.println("LOG FILE RECORD OF INVOICES PROCESSED:\n\n");
			System.out.println(history);
			System.out.println("\nTOTAL OF ALL STAYS: \t" + totalAll);

	}
}