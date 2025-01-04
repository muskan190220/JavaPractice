package MethodPractice;

public class Prime {
    static boolean prime(int num)
    {
        int count = 0;
        for(int i=2;i<num-1;i++)
        {
            if(num%i == 0)
            {
                count = count+1;
            }
        }
        if(count > 0)
        {
            return false;
        }
        else 
        {
            return true;
        }
    }
    public static void main(String args[])
    {
        int n = 11;
        boolean c = prime(n);
        System.out.println(c);
    }
}
