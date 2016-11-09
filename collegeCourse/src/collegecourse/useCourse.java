
package collegecourse;

import javax.swing.JOptionPane;


public class useCourse 
{
    public static void main(String[] args)
    {
        
        CollegeCourse course;
        
    String department = JOptionPane.showInputDialog(null, "Enter 3 letter department: ").toUpperCase();
    String courseNumberInput = JOptionPane.showInputDialog(null, "Enter a course number");
    String creditsInput = JOptionPane.showInputDialog(null, "Enter credits");
    
 
    try
    {
    int courseNumber = Integer.parseInt(courseNumberInput);
    double credits = Double.parseDouble(creditsInput);
    
    
    
        if(department.length() == 3 && !department.matches("[0-9]*")){
        if(department.equals("BIO") ||
           department.equals("CIS") || 
           department.equals("CHM") ||
           department.equals("PHY"))
   {
     course = new labCourse(department, courseNumber, credits);
    }else
        {
            course = new CollegeCourse(department,courseNumber,credits);   
        }
    JOptionPane.showMessageDialog(null, course.displayInfo());
        
    }else{JOptionPane.showMessageDialog(null,"ENTER A VALID DEPARTMENT");}
    
    }catch(NumberFormatException e)
    {
    JOptionPane.showMessageDialog(null,"INVALID ENTRY. PLEASE ENTER A NUMERIC VALUE.");
    }
    
    /*At some point there can be an improvement to catch the invalid entry for classes that fall into the catergory of [1A - 9C etc.].
    NOTES FOR NEXT TIME:
    1. Going to try and put an extra if statement in front of line 34 in future attempts to modify this program.
    2. If that doesnt work try and go for a different approach with the 'try{}catch(){}'.
    3. add another class that contains mulitiple classes and schedules and can better pick out a schedule for all students tomhave classes in a more structured way.
    (I.E.) freshman man go to school in the early morinings (7:00am- 12pm) */
    }
    
}
