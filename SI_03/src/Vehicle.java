
public class Vehicle 
{
    String make;
    String model;
    double mileage;
    
    // Get methods
    //getMake() = f()
    public String getMake() 
    {
        return make;
    }
    //getMileage() = g()
    public double getMileage() 
    {
        return mileage;
    }
    //getModel() = h()
    public String getModel() 
    {
        return model;
    }
    
    // set methods
    //setMake() = f()
    public void setMake(String make) 
    {
        this.make = make;
    }
    //setMileage = g()
    public void setMileage(double mileage) 
    {
        this.mileage = mileage;
    }
    //setModel() = h()
    public void setModel(String model) 
    {
        this.model = model;
    }
    
    public void displayInfo()
    {
        System.out.println(getMake());
    System.out.println(getModel());
    System.out.println(getMileage());
    }
    
}
