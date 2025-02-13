package ExceptionHandling;


class NegativeDimensionException extends Exception{
    public String toString()
    {
        return "Dimensions cannot be negative";
        
    }
}
public class Userdefined {
    static int area(int l , int b)throws NegativeDimensionException
    {
        if(l<0 || b<0)
        {
            throw new NegativeDimensionException();
        }
        int a = l*b;
        return a;
    }

    public void meth1()
    {
        try {
            int a = area(10, 5);
            System.out.println(a);
        } catch (NegativeDimensionException e) {

            System.out.println(e);
        }
        
    }

    public static void main(String args[]) 
    {
        Userdefined u = new Userdefined();
        u.meth1();
    }
    
}
