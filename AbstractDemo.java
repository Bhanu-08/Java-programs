abstract class One
{
    abstract void add(int a,int b);
    void sub(int a,int b)
    {
        System.out.printf("%d - %d = %d",a,b,(a-b));
    }
}
class Child extends One
{
    void add(int a,int b)
    {
        System.out.printf("%d + %d = %d\n",a,b,(a+b));

    }
}
public class AbstractDemo 
{
    public static void main(String[] args) 
    {
        One o1=new Child();
        o1.add(9, 1);
        o1.sub(10, 1);
    }
    
}
