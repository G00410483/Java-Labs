public class Employee
{
	private String name;
	private int idNumber;
	private String department;
	private String position;

	public void setEmployee(String name1, int idNumber1, String department1, String position1)
	{
		name = name1;
		idNumber = idNumber1;
		department = department1;
		position = position1;
	}
	public String getName()
	{
		return name;
	}
	public int getidNumber()
	{
		return idNumber;
	}
	public String getDepartment()
	{
		return department;
	}
	public String getPosition()
	{
		return position;
	}
}
