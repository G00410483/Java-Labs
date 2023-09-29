
public class Model
{
	private String model;
	private int RAM;
	private double diskSize;

	public void setModel(String model)
	{
		this.model = model;
	}
	public void setRAM(int RAM)
	{
		this.RAM = RAM;
	}
	public void setDiskSize(double diskSize)
	{
		this.diskSize = diskSize;
	}
	public String getModel()
	{
		return model;
	}
	public int getRAM()
	{
		return RAM;
	}
	public double getDiskSize()
	{
		return diskSize;
	}
	public char getRating()
	{
		if (RAM >= 8 && diskSize >= 1)
		{
			return 'A';
		}
		else
		{
			return 'B';
		}
	}
}


