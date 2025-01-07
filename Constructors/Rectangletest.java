package Constructors;

public class Rectangletest 
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle(10,10);

        System.out.println("The area of the rectangle is: "+r.area());
        System.out.println("The perimeter of the rectangle is: "+r.perimeter());
        System.out.println("Is it a square: "+r.isSquare());

    }
}
