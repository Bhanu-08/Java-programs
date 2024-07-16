abstract class Bank
{
    void openAccount()
    {
        System.out.println("Account is opened");
    }
    abstract void deposit(float amt);
}
//concrete class:it is a class that can be instantiated(we can create object)
class CityBank extends Bank
{
    void deposit(float amt)
    {
        System.out.println("Deposited:"+amt);
    }

}
public class AbstractDemo2 {
    public static void main(String[] args) 
    {
        Bank b=new CityBank();
        b.openAccount();
        b.deposit(1000.0f);
    }
    
}
