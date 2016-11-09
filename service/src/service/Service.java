package service;

public class Service {
	String description;
	double price;
	int duration;
	
	//default constructor with 3 arguments
	public Service(String description, double price, int duration){
		this.description = description;
		this.price = price;
		this.duration = duration;
	}
	
	//get methods
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public int getDuration() {
		return duration;
	}
	
}
