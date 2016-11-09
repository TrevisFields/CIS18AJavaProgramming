
package collegecourse;

public class labCourse extends CollegeCourse 
{
    private final double LAB_FEE = 50.0;
    public labCourse(String department, int courseNumber, double credits)
    {
    super(department, courseNumber, credits);
    }
    //calculate credit fee with lab fee
    @Override
    public double getCalculatedTuition()
    {
    double tuition = getCredits() * CREDIT_FEE + LAB_FEE;
    return tuition;
    }
    
    //display method with Lab Fee and lab dialog
    
    public String displayInfo()
    {
   String info = "DEPARTMENT: " + getDepartment() + "\n" + "COURSE NUMBER: " + getCourseNumber()+ "\n" +"THIS HAS A LAB COURSE"+ "\n"+ "credits: " + getCredits()
           + "\n" + "TUITION FEE:" + getCalculatedTuition();
            
   return info;
    }
    
}
