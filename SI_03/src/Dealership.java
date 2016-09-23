
public class Dealership 
{
   public static void main(String[] args)
    {
        // Class     object      = new instance
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        
        // set object value
        vehicle1.setMake("FORD");
        vehicle1.setModel("THUNDERBIRD");
        vehicle1.setMileage(12.55);
        
        vehicle2.setMake("Honda");
        vehicle2.setModel("NSX");
        vehicle2.setMileage(200.35);
    
    vehicle1.displayInfo();
    vehicle2.displayInfo();
    }
}
