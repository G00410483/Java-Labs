public class Phone
{
	private String name;
	private double price;
	private int stock;

	public void setPhone(String name1, double price1, int stock1)
	{
		price = price1;
		name = name1;
		stock = stock1;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public int getStock()
	{
		return stock;
	}
}
