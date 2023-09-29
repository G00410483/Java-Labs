public class Passanger
{
	private String name;
	private String surname;
	private int yearBirth;
	private boolean ticket;
	private double price;
	private static int pass = 0;
	private static int passFC = 0;
	private static double totalPrice = 0;

	public Passanger (String name, String surname, int yearBirth, boolean ticket, double price)
	{
		this.name = name;
		this.surname = surname;
		this.yearBirth = yearBirth;
		this.ticket = ticket;
		this.price = price;

		totalPrice = totalPrice + price;

		if (price == 200)
		{
			pass = pass + 1;
			passFC = passFC + 1;
		}
		else
		{
			pass = pass + 1;
		}

	}
	public String toString()
	{
		String output = "firstName = '" + name + "', lastName = '" + surname + "', year = '" + yearBirth + "', firstclass = '" + ticket + "', price = '" + price;
		return output;
	}
	public static String report()
	{
		return "-- FLIGHT REPORT --\nTotal passanger: " + pass + "\nTotal first class passangers: " + passFC + "\nTotal Economy passangers: " + (pass - passFC) + "\nTotal take: " + totalPrice;
	}
}
