package AbstractClass;

import java.io.PrintStream;

abstract class Shape
{
    Shape()
    {
        System.out.println("Shapes Standard");
    }
    abstract public int perimeter();
    abstract public int area();
}

class Circle extends Shape
{
    public int radius;
    public int perimeter()
    {
        return (int) (2*Math.PI*radius);
    }
    public int area()
    {
        return (int) (Math.PI*radius*radius);
    }
    
}
class Rectangle extends Shape
{
    public int length;
    public int breadth;
    
    public int perimeter()
    {
        return 2*(length + breadth);
    }
    public int area()
    {
        return length*breadth;
    }
}
public class Calculate 
{
    public static void main(String args[])
    {
        Rectangle r =new Rectangle();
        r.length = 10;
        r.breadth = 8;
        System.out.println("Area of rectangle is: "+r.area());
        System.out.println("Perimeter of rectangle is: "+r.perimeter());

        Circle c = new Circle();
        c.radius = 5;
        System.out.println("Area of circle is: "+c.area());
        System.out.println("Perimeter of circle is: "+c.perimeter());


    }
    
    
}   
