package InnerClasses;

class Outer
{
    int x = 10;
    class Inner
    {
        int y = 20;
        void swap()
        {
            System.out.println("Old values: ");
            System.out.println("x = "+x);
            System.out.println("y = "+y);
            
            x = x+y;
            y = x-y;
            x = x-y;

            System.out.println("New Values: ");
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }
    }
    void Answer()
    {
        Inner i = new Inner();
        i.swap();
    }
}
public class Nestedclass 
{
    public static void main(String args[])
    {
        Outer o = new Outer();
        o.Answer();

        //Other way to directly access the inner class method:
        Outer.Inner oi = new Outer().new Inner();
        oi.swap();
    }
    
}
