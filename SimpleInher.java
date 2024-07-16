class Base
{
    int a,b;
    Base(int a,int b)
    {
        System.err.println("Base parameterized comstructor");
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.err.println("Base display");
        System.err.println("a:\t"+a);
        System.err.println("b:\t"+b);
    }
}
class Child extends Base
{
    int c,d;
    Child(int c,int d)
    {
        super(10,20);
        this.c=c;
        this.d=d;
        System.err.println("Child class");
    }
    void display1()
    {
        System.err.println("Child display");
        System.err.println("c:\t"+c);
        System.err.println("d:\t"+d);
    }
}
public class SimpleInher
{
    public static void main(String[] args) 
    {
        Child e=new Child(100,200);
        e.display();
        e.display1();
    }
}
