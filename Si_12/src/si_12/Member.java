
package si_12;

public class Member 
{
    private int id;
    private String name;
    private double assets;
    
    protected final double INTEREST = 0.1;
    
    //Constructor with no parameters
    public Member()
    {
        id = 0;
        name = "admin";
        assets = 0.0;
    }
    //Constructor with 3 parameters
    public Member(int id, String name, double assets)
    {
        this.id = id;
        this.name = name;
        this.assets = assets;
    }
    
    //get methods
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getAssets()
    {
        return assets;
    }
    public void setAssets(double assets){
    this.assets = assets;
    }
    public double calculateAnnualInterest(){
        double interest = getAssets() * INTEREST;
        return interest;
    }
    public void displayInfo()
    {
        System.out.println("ID: " + getId());
        System.out.println("NAME: " + getName());
        System.out.println("ID: " + getAssets());
        System.out.println("INTEREST: " + INTEREST + "%");
    }
    
}
