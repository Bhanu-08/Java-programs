class Base
{
    int a;
    Base()
    {
        //super();
        System.err.println("Base constructor");
        a=0;
    }
}
class Child extends Base
{
    int b;
    Child()
    {
        //super();
        System.err.println("Child constructor");
        b=0;
    }
}
public class Third 
{
    public static void main(String[] args) 
    {
        Child c1=new Child();
        System.err.println(c1.a);
        System.err.println(c1.b);
    }
}
