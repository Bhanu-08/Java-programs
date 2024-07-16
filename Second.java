class One
{
    static int count;
    int a,b;
    static 
    {
        count=0;
    }
    One()//used to initialize object
    {
        //super();
        //a=0;
        //b=0;
    }
}
public class Second
{
    public static void main(String[] args) 
    {
        One o1=new One();
        One o2=new One();
        One.count=2;
        System.err.println(One.count);
        //o1 object initialization
        o1.a=100;
        o1.b=200;
        //o2 object initialization
        o2.a=300;
        o2.b=400;
        System.err.println("o1 object State");
        System.err.println(o1.a);
        System.err.println(o1.b);
        System.err.println("o2 object state");
        System.err.println(o2.a);
        System.err.println(o2.b);
    }
}
