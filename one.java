class HousePlan
{
    static String city;
    byte kitchen;
    short prayerroom;
    int br1,br2;
    static
    {
        System.err.println("this is static block");
        city="machilipatnam";
    }
    //Instance block
    {
        System.out.println("this is instance block");
    }
    //constructor
    HousePlan()
    {
        //super();
        System.out.println("This is constructor");
        kitchen=0;
        prayerroom=0;
        br1=0;
        br2=0;
    }
    //instance method
    void HousePlan()
    {
        System.err.println("This is instance method");
    }
    static void fun1()
    {
        System.err.println("Static method");

    }
}
public class one
{
    public static void main(String[] args) 
    {
            HousePlan p1= new HousePlan();
            //p1=1002
            System.out.println(p1.kitchen);
            System.err.println(p1.prayerroom);
            System.err.println(p1.br1);
            System.err.println(p1.br2);
    }
}

        