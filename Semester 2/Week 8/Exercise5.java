public class Exercise5
{
	public static void main(String[] args)
	{
		Account a = new Account("Grace", "Hopper", 100);
		Account b = new Account("Ivan", "Milan", 300);
		Account c = new Account("Jack", "Sparrow", 400);
		Account d = new Account("David", "Beckham", 230);

		System.out.println(Account.getValue());

		a.withdraw(150);
		b.withdraw(100);
		c.withdraw(1000);
		d.withdraw(50);
		a.withdraw(99);
	}
}