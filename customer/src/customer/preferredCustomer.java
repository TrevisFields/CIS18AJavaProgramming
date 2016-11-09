/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author TrevisFields
 */
public class preferredCustomer extends Customer
{
    double discountRate;
    public preferredCustomer(int id, double bal, double rate)
    {
        super(id, bal);
        discountRate = rate;
    }
    public void display()
    {
        super.display();
        System.out.println("    Discount rate is " + discountRate);
    }
    
}
