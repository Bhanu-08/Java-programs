class One
{
    int a,b;
    One(int a,int b)
    {
        //this is a present object
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.err.println("Object state");
        System.err.println("a="+a);
        System.err.println("b="+b);
    }
}
public class Four
{
    public static void main(String[] args) 
    {
        One o1=new One(10,20);
        o1.display();
        One o2=new One(100,200);
        o2.display();
    }
}
