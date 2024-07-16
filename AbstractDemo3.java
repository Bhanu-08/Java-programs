import java.util.Scanner;
abstract class Shape
{
    abstract void area();
}
class Circle extends Shape
{
        void area()
        {
            
            Scanner s=new Scanner(System.in);
            System.out.println("Enter radius");
            int r=s.nextInt();
            double area=3.14*r*r;
            System.out.println("Circle area:"+area);
        }
}
class Rectangle extends Shape
{
        void area()
        {
            System.out.println("Rectangle area");
        }
}
public class AbstractDemo3 
{
    public static void main(String[] args) 
    {
        Shape s=new Circle();
        Shape r=new Rectangle();
        s.area();
        r.area();
    }
    
}
