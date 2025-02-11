package ExceptionHandling;
import java.util.*;

public class throwexception{
    int area(int l, int b) throws Exception
    {
        if(l<0 || b<0)
        {
            throw new Exception("Length or Breadth cannot be negative");
        }
        int a = l*b;
        return a;   
    }
    public void meth1()
    {
        try (Scanner s = new Scanner(System.in)) {
            int l = s.nextInt();
            int b = s.nextInt();
            try
            {
                int a = area(l,b);
                System.out.println("Area = " +a);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public static void main(String args[])
    {
        throwexception t = new throwexception();
        t.meth1();
    }
}
