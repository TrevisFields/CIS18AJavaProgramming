package hw_04;
public class State 
{
    //Create Class/ Datatype    object/ variables
    String                       stateName;
    int                          statePopulation;
    City                          capitalCity;
    City                          mostPopulousCity;
    
    //Constructor method with 6 parameters
    public State(String s,int sp, String cc,int cp, String mc, int mp)
    {
        stateName = s;
        statePopulation = sp;
        
        //Object    = new constructor method
        capitalCity = new City(cc, cp);
        mostPopulousCity = new City(mc, mp);
    }
        //Get methods
    public String getStateName()
    {
        return stateName;
    }
    public int getStatePopulation()
    {
        return statePopulation;
    }
    public String getCapitalName()
    {
        return capitalCity.getCityName();
    }
    public int getCapitalPop()
    {
        return capitalCity.getCityPop();
    }
    public String getMostPopulousCityName()
    {
        return mostPopulousCity.getCityName();
    }
    public int getMostPopulousCityPop()
    {
        return mostPopulousCity.getCityPop();
    }
    //Inner class should always be private
    private class City
    {
        private String cityName;
        private int cityPop;
        
        //Inner constructor method with 2 parameters
        public City(String c, int p)
        {
            cityName = c;
            cityPop = p;
        }
        //Get methods
        public String getCityName() 
        {
            return cityName;
        }
        public int getCityPop() 
        {
            return cityPop;
        }   
    }
}
