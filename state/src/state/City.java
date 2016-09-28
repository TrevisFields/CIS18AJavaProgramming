/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author TrevisFields
 */
public class City 
{
    private static String capitalName;
    private static int capitalPopulation;
    public City(String cap, int pop)
    {
        capitalName = cap;
    capitalPopulation = pop;
    }
		public static void setCapitalName(String cap)
			{
				capitalName = cap;
			}
		public static String getCapitalName()
			{
				return capitalName;
			}
		public static int getCapitalPopulation()
			{
				return capitalPopulation;
			}
    
}
