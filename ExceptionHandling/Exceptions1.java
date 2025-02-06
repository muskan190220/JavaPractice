package ExceptionHandling;

public class Exceptions1 {
    public static void main(String args[])
    {
        try
        {
            int a = 10, b = 0;
            int c = a/b;
            System.out.println("Result: " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception: " + e);
        }
        
        System.out.println("End of program");
    }
}
