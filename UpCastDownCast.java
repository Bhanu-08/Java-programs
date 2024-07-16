class Base
{
    int a=100;
    static int s=200;
    static void fun1()
    {
        System.err.println("Base class static blok");
    }
    void display()
    {
        System.err.println("Base class display ..instance");
    }
}
class Child extends Base
{
    int a=1000;
    static int s=2000;
    static void fun1()
    {
        System.err.println("Child class static blok");
    }
    void display()//instance method
    {
        System.err.println("Child class display ..instance");
    }

}
public class UpCastDownCast
 {
    public static void main(String[] args) 
    {
        //Base b=new Child();
        //Child c=(Child)b;
        //Child c2=(Child)new Base();//ClassCastException
        //System.err.println(b.a);
        //System.err.println(b.s);
        //System.err.println(c.a);
        //System.err.println(c.s);
        //b.fun1();
        //c.fun1();
        //b.display();
        //c.display();
        Base b=new Child();
        Child c=(Child)b;
        c.display();
        ((Child)b).display();
    }
}
