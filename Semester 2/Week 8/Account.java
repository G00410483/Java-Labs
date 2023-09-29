public class Account
{
	private String name;
	private String surname;
	private double deposit;
	private static double vault;

	public Account (String name, String surname, double deposit)
	{
		this.name = name;
		this.surname = surname;
		this.deposit = deposit;
		vault = vault + deposit;
	}

	public static double getValue()
	{
		return vault;
	}
	public void withdraw(double amount)
	{
		System.out.println(name + " " + surname + " has requested to withdraw " + amount + " from vault, " + name + " " + surname + "'s current balance is " + deposit);

		if (amount < vault)
		{
			vault = vault - amount;
			System.out.println("TRANSACTION COMPLETED \n" + name + " " + surname + "'s balance now is " + (deposit - amount) + "\nThere is now " + vault + " in the vault\n");
		}
		else if (amount > vault)
		{
			System.out.println(name + " " + surname + " has requested to withdraw " + amount + " from the vault, but there is only " + deposit + " in the vault" + "\n TRANSCATION NOT COMPLETED\n");
		}

	}
}

