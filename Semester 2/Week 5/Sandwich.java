public class Sandwich
{
	private String ingredient;
	private String bread;
	private double price;

	public Sandwich(String ingredient, String bread, double price)
	{
		this.ingredient = ingredient;
		this.bread = bread;
		this.price = price;
	}
	public Sandwich(String ingredient)
	{
		this.ingredient = ingredient;
	}
	public Sandwich(double price)
	{
		this.price = price;
	}
	public Sandwich()
	{
		this.ingredient = ingredient;
		this.bread = bread;
		this.price = price;
	}
	public String getIngredient()
	{
		return ingredient;
	}
	public String getBread()
	{
		return bread;
	}
	public double getPrice()
	{
		return price;
	}
}
