import javax.swing.JOptionPane;

public class Question3
{
	public static void main(String[] args)
		{
			String name;
			String ageS;
			int ageI;
			String number1;
			String number2;
			int firstNumber;
			int anotherNumber = 0;
			int choice1 = 0;
			int choice2 = 0;
			int total = 0;
			String history = "";

			JOptionPane.showMessageDialog(null, "Welcome to Java Adder Program", "Messege", JOptionPane.INFORMATION_MESSAGE);

			name = JOptionPane.showInputDialog("Enter your name:");
			ageS = JOptionPane.showInputDialog("Enter your age:");
			ageI = Integer.parseInt(ageS);

			JOptionPane.showMessageDialog(null, "Hi " + name + "\n\nYou were born in " + (2021-ageI), "Messege", JOptionPane.INFORMATION_MESSAGE);

			number1 = JOptionPane.showInputDialog("Enter the first number:");
			firstNumber = Integer.parseInt(number1);
			choice1 = JOptionPane.showConfirmDialog(null, "Do you want to add another number to this?\nCurrent total is: " + firstNumber, "Choose an Option", JOptionPane.YES_NO_CANCEL_OPTION);

			while (choice2 == 0)
			{
				number2 = JOptionPane.showInputDialog("Enter another number:");
				anotherNumber = Integer.parseInt(number2);
				total = total + anotherNumber;
				choice2 = JOptionPane.showConfirmDialog(null, "Do you want to add another number to this?\nCurrent total is: " + (firstNumber+total), "Choose an Option", JOptionPane.YES_NO_CANCEL_OPTION);
				history = history + anotherNumber + "\n";
			}
			if (choice2 == 1)
			{
				JOptionPane.showMessageDialog(null, "Calculations complete.\nThe numbers entered were:\n" + firstNumber + "\n" + history + "-------\nTOTAL: " + (firstNumber+total), "Messege", JOptionPane.INFORMATION_MESSAGE);
			}
		}
}
