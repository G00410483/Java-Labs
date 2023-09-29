public class Customer
{
	private String name;
	private String adress;
	private long number;

	public Customer(String name)
	{
		this.name = name;
	}
	public Customer (String name, String adress)
	{
		this.name = name;
		this.adress = adress;
	}
	public Customer(String name, long number)
	{
		this.name = name;
		this.number = number;
	}
	public Customer(String name, String adress, long number)
	{
		this.name = name;
		this.adress = adress;
		this.number = number;
	}
	public String getName()
	{
		return name;
	}
	public String getAdress()
	{
		return adress;
	}
	public long getNumber()
	{
		return number;
	}
}
