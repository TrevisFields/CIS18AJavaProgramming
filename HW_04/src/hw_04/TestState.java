package hw_04;



public class TestState 
{
    public static void main(String[] args)
    {
        //Class     object = new Constructor method
        State california = new State("CALIFORNIA", 1000000,
                "Sacramento", 62, "Moreno Valley", 39495966);
        california.displayCityInfo();
    }
    
}
