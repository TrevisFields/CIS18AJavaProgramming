
package collegecourse;


public class CollegeCourse {

   private String department;
   private int courseNumber;
   private double credits;
   
    protected final double CREDIT_FEE = 120.0;
    
    //constructor with 3 parameters
    public CollegeCourse(String department, int courseNumber, double credits)
    {
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }
    public double getCalculatedTuition()
    {
        double tuition = getCredits() * CREDIT_FEE;
        
        return tuition;
    }
    
    //GET METHODS
    public double getCredits()
    {
        return credits;
    }
    public int getCourseNumber()
    {
        return courseNumber;
    }
    public String getDepartment()
    {return department;}
    
    //DISPLAY METHOD
            public String displayInfo()
            {
                String info = "DEPARTMENT: " + getDepartment() + "\n" + "COURSE NUMBER: " + getCourseNumber()+ "\n" + "credits: " + getCredits()
           + "\n" + "TUITION FEE:" + getCalculatedTuition();
            
            return info;
            }
}
