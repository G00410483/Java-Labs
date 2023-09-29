public class Technology
{
	public String brand;
	public String model;
	public char type;
	public double cost;
	public static int totalPhones;
	public static int totalComputers;
	public static int totalSpeakers;
	public static int totalOthers;
	public static double []myArray;

	public Technology(String b, String m, char t, double c)
	{
		brand = b;
		model = m;
		type = t;
		cost = c;

		if (type == 'P')// If product is phone
		{
			totalPhones = totalPhones + 1;
		}
		if (type == 'C')
		{
			totalComputers = totalComputers + 1;// If product is computer
		}
		if (type == 'S')
		{
			totalSpeakers = totalSpeakers + 1;// If product is speaker
		}
		if (type == 'O')
		{
			totalOthers = totalOthers + 1;// If products is other
		}
	}
	// Setters for fields
	public void setBrand(String brand)
	{
	}
	public void setModel(String model)
	{
	}
	public void setType(char type)
	{
	}
	public void setCost(double cost)
	{
	}
	// Getter for fields
	public String getBrand()
	{
		return brand;
	}
	public String getModel()
	{
		return model;
	}
	public char getType()
	{
		return type;
	}
	public double getCost()
	{
		return cost;
	}
	public static String report()// Method that displays number of each products and total number of all products
	{
		return "Number of phones: " + totalPhones + "\nNumber of computers: " + totalComputers + "\nNumber of speakers: " + totalSpeakers + "\nNumber of other items: " + totalOthers + "\nTOTAL: " + (totalPhones + totalComputers + totalSpeakers + totalOthers);
	}
	public String toString()// Method that displays iformation about each product
	{
		String output = "{brand = '" + brand + "', model = '" + model + "', type = '" + type + "', cost = '" + cost + "'}";
		return output;
	}
}