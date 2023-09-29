public class Product
{
	private String name;
	private double price;

	public void setProduct(String name1, double price1)
	{
		name = name1;
		price = price1;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public double getrP()
	{
		double rp = price + (price*0.45);
		return rp;
	}
}
