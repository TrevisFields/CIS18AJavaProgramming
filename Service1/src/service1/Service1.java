package service1;

public class Service1 
{
	String description;
	double price;
	int duration;
	
	//default constructor with 3 arguments
	public Service1(String description, double price, int duration)
        {
		this.description = description;
		this.price = price;
		this.duration = duration;
	}
	
	//get methods
	public String getDescription() 
        {
		return description;
	}
	public double getPrice() 
        {
		return price;
	}
	public int getDuration() 
        {
		return duration;
	}
	
}
