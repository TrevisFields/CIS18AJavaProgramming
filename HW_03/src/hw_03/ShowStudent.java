package hw_03;
public class ShowStudent
{
    public static void main(String[] args)
    {
    // Class     object     = new instance method
    Student      info     = new Student();
    
    // set values into student object
    info.setId(2276714);
    info.setCredit(3.0);
    info.setPoints(12.0);
    
    System.out.println(info.displayInfo());
    }
}
