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
public class TestState 
{
    public static void main(String[] args)
			{
				State test001 = new State("Massachusetts", 864220, "Boston", 432110, "Springfield", 22550);
				System.out.println("State: " + test001.getStateName());
				System.out.println("State Population: " + test001.getStatePopulation());
				System.out.println("Capital Name: " + City.getCapitalName());
				System.out.println("Capital Population: " + City.getCapitalPopulation());
			}
}
