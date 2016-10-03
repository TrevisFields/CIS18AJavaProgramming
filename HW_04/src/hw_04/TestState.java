package hw_04;



public class TestState 
{
    public static void main(String[] args)
    {
        //Class     object = new Constructor method
        State california = new State("CALIFORNIA", 1046753,
                "Sacramento", 700000, "Moreno Valley", 25000);
        california.displayCityInfo();
        
        State texas = new State("TEXAS", 2345231,
                "Houston", 54000, "Austin", 800000);
        texas.displayCityInfo();
        
        State arizona = new State("Arizona", 10039456,
                "Phoneix", 150000, "Tucson", 70200);
        arizona.displayCityInfo();
    }
    
}
