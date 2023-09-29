public class RetailItem
{
	private String description;
	private int unitsOnHand;
	private double price;

	public void setRetailItem(String description1, int unitsOnHand1, double price1)
	{
		description = description1;
		unitsOnHand = unitsOnHand1;
		price = price1;
	}
	public String getDescription()
	{
		return description;
	}
	public int getunitsOnHand()
	{
		return unitsOnHand;
	}
	public double getPrice()
	{
		return price;
	}
}
