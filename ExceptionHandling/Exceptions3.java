package ExceptionHandling;

class MinBalException extends Exception
{
    public String toString()
    {
        return "Minimum balance should be 5000, Try again with smaller amount";
    }
}
public class Exceptions3 {
    public static void main(String args[])
    {
        int bal = 10000;
        int amt = 6000;

        try{
            bal = bal-amt;
            if(bal<5000)
                throw new MinBalException();
        }
        catch(MinBalException e)
        {
            System.out.println(e);
        }
    }
}
