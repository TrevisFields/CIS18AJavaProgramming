package hw_04;



public class TestState 
{
    public static void main(String[] args)
    {
        //Class     object = new Constructor method
        State california = new State("CALIFORNIA", 1046753,
                "Sacramento", 700000, "MORENO VALLEY", 25000);
        california.displayCityInfo();
        
        State texas = new State("TEXAS", 2345231,
                "HOUSTON", 54000, "AUSTIN", 800000);
        texas.displayCityInfo();
        
        /*
        State arizona = new State("Arizona", 10039456,
                "PHONEIX", 150000, "TUCSON", 70200);
        arizona.displayCityInfo();
        */
        
        /*
        State newYork = new State("NEW YORK", 345029343,
                "ALBANY", 500000, "BUFFALO", 70001923);
        newYork.displayCityInfo();
        */
        
        
    }
    
}
