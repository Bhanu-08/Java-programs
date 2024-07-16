class One
{
    void display()
    {
        System.err.println("s:\t" + s);
        System.err.println("a:\t"+a);
        System.err.println("b:\t"+b);
    }
    static int s;
    int a,b;
}
public class TopDown 
{
    public static void main(String[] args) {
        One o1=new One();
        //o1.display()
        System.err.println(One.s);
        System.err.println(o1.s);
    }
    
}
