package hw_03;
public class ShowStudent
{
    public static void main(String[] args)
    {
    // Class     object     = new instance method
    Student      trevis     = new Student();
    
    // set values into student object
    trevis.setId(2276714);
    trevis.setCredit(12.0);
    trevis.setPoints(3.0);
    
    System.out.println(trevis.displayInfo());
    }
}
