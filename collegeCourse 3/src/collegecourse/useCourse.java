
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
    (I.E.) freshman man go to school in the early morinings (7:00am- 12pm) 
    2.* Update: placed a corrected form of the if statement to catch the department from being entered in as numbers
    4. Modify the program so that there can be files saved for a student to create a schedule that can span several semesters
    4a. Possible idea to include notes and other bits of information for the user to have access to while looking at the class schedule. 
    5. Load class schedule with selected books for the classes and possibly even notes and chapters from previous books that the user can access during the course of the class
    OPTIONAL: Figure out how to loop the program so that the user has to enter in the proper set of values for the program so that 
    the user gets a schedule.
    QUESTIONS:
    Why does the program not allow it to move forward?
    Why does the program allow the user to enter in the wrong set of values but at the same time still accept the entered value.*/
    }
    
}
