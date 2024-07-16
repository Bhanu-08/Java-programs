interface Inf1
{
    int a=100;
    int add(int a,int b);
}
class One implements Inf1
{
    public int add(int x,int y)
    {
        return x+y;
    }
}
public class InterfaceDemo1
{
    public static void main(String[] args) 
    {
        Inf1 i1=new One();
        int r=i1.add(10,20);
        System.out.println(r);
    }
} 