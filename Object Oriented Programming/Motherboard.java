package Labwork5;

public class Motherboard
{
	protected int RAM_size;
	
	public int getRAM()
	{
		return RAM_size;
	}
	public void setRAM(int new_RAM_size)
	{
		if(new_RAM_size >= 1 && new_RAM_size <= 16)
		{
			RAM_size = new_RAM_size;
		}
		 else if (new_RAM_size < 1) 
		 {
			 throw new IllegalArgumentException("RAM size too low");
		 }
		 else if (new_RAM_size > 16) 
		 {
			 throw new IllegalArgumentException("Overkill RAM size");
		 }
	}
	
	 public String toString()
	    {
	        return ("RAM size of Motherboard is: " + RAM_size);
	    }
}








