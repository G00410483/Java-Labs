public class Member
{
	public String name;
	public String surname;
	public String ID;
	public String type;
	public static int counter = 100;
	public static double price;
	public static double totalPrice1;
	public static double totalPrice2;
	public static int stMem = 0;
	public static int prMem = 0;

	public Member (String n, String s)
	{
		name = n;
		surname = s;
		type = "standard";
		price = 40;
		totalPrice1 = totalPrice1 + price;
		stMem = stMem + 1;
		ID = "G" + (++counter);
	}
	public Member (String n, String s, char letter)
	{
		name = n;
		surname = s;
		type = "premium";
		price = 52.50;
		totalPrice2 = totalPrice2 + price;
		prMem = prMem + 1;
		ID = "G" + (++counter);
	}
	public void setName(String name)
	{
	}
	public void setSurname(String surname)
	{
	}
	public void setID(String ID)
	{
	}
	public String getName()
	{
		return name;
	}
	public String getSurname()
	{
		return surname;
	}
	public String getID()
	{

		return ID;
	}
	public String toString()
	{
		String output = "- - Member details - -" + "\nName : " + name + " " + surname + "\nFee paid: " + price +"\nMembership type: " + type + "\nID number: " + ID + "\n";
		return output;
	}
	public String gymReport()
	{
		String gymReport = "----------GYM REPORT----------" + "\nSTANDRAD MEMBERS " + stMem + "\nPREMIUM MEMBERS: " + prMem + "\nTOTAL MEMBERS: " + (prMem + stMem) + "\nTOTAL FEES COLLECTED: " + (totalPrice1 + totalPrice2);
		return gymReport;
	}
	public String annualReport()
	{
		String annualReport = "----------ANNUAL REPORT----------" + "\nTOTAL FEES COLLECTED IN 12 MONTHS: \n\tEUR " + ((totalPrice1 + totalPrice2) * 12);
		return annualReport;
	}
	public String openingHours()
	{
		String openingHours = "******************************\nWelcome to JAVA GYM\nOpening hours are:\nMonday to Friday: 7am to 10pm\nSaturdays and Sundays: 9am to 8pm\n******************************";
		return openingHours;
	}
}
