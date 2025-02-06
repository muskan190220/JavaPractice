package ExceptionHandling;


public class Exceptions2 {
    public static void main(String args[])
    {
        try{
            int[] a = {10,0,12,5,4,3,9,4,1,7};
            int r = a[1]/a[0];
        }
        catch(ArithmeticException e)
        {
            System.out.println("Demonitor cannot be 0, try again");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound ");
        }
        
        
    }
}
