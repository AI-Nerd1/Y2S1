package Labwork5;

class Processor extends Motherboard
{
	protected String brand;
	protected float clock_frequency;
	protected int cache_volume;
	protected float cost;
	
	public String getBrand() { 
	     return brand;
	     }
    public float getCF()     {
    	return clock_frequency;
    	}

	 public int getCV()       {
	     return cache_volume;
	     }
	 public float getCost()	  {
		 return cost;
		 }
	 
	 public void setBrand(String new_brand) {
		 brand = new_brand;
	 }
	 public void setCF(float new_clock_frequency) 
	 {
		 if(new_clock_frequency >= 1.2 && new_clock_frequency <= 5.2) 
		 {
			 clock_frequency = new_clock_frequency;
		 }
		 else if (new_clock_frequency < 1.2) 
		 {
			 throw new IllegalArgumentException("Clock frequency too low");
		 }
		 else if (new_clock_frequency > 5.2) 
		 {
			 throw new IllegalArgumentException("Clock frequency too high");
		 }
	 }
	 public void setCV(int new_cache_volume) 
	 {
		 if(new_cache_volume >= 8 && new_cache_volume <= 1024) 
		 {
			 cache_volume = new_cache_volume;
		 }
		 else if (new_cache_volume < 8) 
		 {
			 throw new IllegalArgumentException("Cache volume too low");
		 }
		 else if (new_cache_volume > 1024) 
		 {
			 throw new IllegalArgumentException("Cache volume too high");
		 }
	 }
	 public void setCost(float new_cost) 
	 {
		 if(new_cost >= 500 && new_cost <= 2000) 
		 {
			 cost = new_cost;
		 }
		 else if (new_cost < 500) 
		 {
			 throw new IllegalArgumentException("Price unrealistically too low");
		 }
		 else if (new_cost > 2000) 
		 {
			 throw new IllegalArgumentException("Cost unrealistically too expensive");
		 }
	 }
	 
	 @Override
	public boolean equals(Object obj) 
	 {
		if (this == obj) 
		{
			return true;
		}
		if (obj == null) 
		{
			return false;
		}
		if (obj instanceof Processor) 
		{
			Processor temp = (Processor) obj;
			return 	   this.brand == temp.brand
					&& this.clock_frequency == temp.clock_frequency
					&& this.cache_volume == temp.cache_volume
					&& this.cost == temp.cost;
		}
		else 
		{
			return false;
		}
	}
		public int int_hashCode() {
			int hash = 10;
			hash = 31 * hash + this.cache_volume;
			return hash;
		}
		public float float_hashCode() {
			float hash = 10;
			hash = 31 * hash + this.clock_frequency;
			hash = 31 * hash + this.cost;
			return hash;
		}
		
		@Override
		public String toString() {
		String str = "Brand = " + brand + ";"
				+ " Clock Frequency = " + clock_frequency + "GHz;"
				+ "Cache Volume  = " + cache_volume + "Kb;"
				+ "Cost = $" + cost;
		return str;
		}
}