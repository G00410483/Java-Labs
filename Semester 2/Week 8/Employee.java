public class Employee
{
	private String name;
	private String surname;
	private int ID;

	public Employee (String name, String surname, int ID)
	{
		this.name = name;
		this.surname = surname;
		this.ID = ID;
	}
	public String toString()
	{
	 	String output = "EMPLOYEE DETAILS\nFirst name: " + name + "\nSurname: " + surname + "\nID number: " + ID + "\n";
	 	return output;
 	}

}

