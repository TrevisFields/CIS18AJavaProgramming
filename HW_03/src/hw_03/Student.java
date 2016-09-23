package hw_03;
public class Student 
{
    // variables
 int id;
 double credit;
 double points;
 // get methods
    public double getCredit()
    {
        return credit;
    }
    public int getId()
    {
        return id;
    }
    public double getPoints() 
    {
        return points;
    }
    public double getGPA()
    {
        double gpa = (getPoints() / getCredit());
        return gpa;
    }
    // set methods - assigning values to variable/ objects
    public void setId(int id) 
    {
        this.id = id;
    }
    public void setCredit(double credit) 
    {
        this.credit = credit;
    }
    public void setPoints(double points) 
    {
        this.points = points;
    }
    public String displayInfo()
    {
        String info = "Student ID:" + getId() + "\n" +
                      "Credit hours: " + getCredit() +"\n" +
                      "Points: " + getPoints() + "\n" + 
                      "GPA: " + getGPA();
    return info;
    }
    // end of program
}
