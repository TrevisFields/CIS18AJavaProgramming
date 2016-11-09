
package customer;

public class testCustomers 
{
    public static void main(String[] args)
    {
        Customer oneCust = new Customer(124, 123.45);
        preferredCustomer onePCust = new preferredCustomer(125, 3456.78, 0.15);
        oneCust.display();
        onePCust.display();
    }
}
