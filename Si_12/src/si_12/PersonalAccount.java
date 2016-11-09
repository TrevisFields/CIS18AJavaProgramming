/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package si_12;

/**
 *
 * @author TrevisFields
 */
public class PersonalAccount extends Member {
    private static final double PERSONAL_INTEREST = 0.2;
    
    public PersonalAccount(int id, String name, double assets)
    {
        //using super constructor with 3 parameters
        super(id,name,assets);
    }
    @Override
    public double calculateAnnualInterest(){
    double interest = getAssets() * (super.INTEREST + PERSONAL_INTEREST);
    
    return interest;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        
    }
    
}
