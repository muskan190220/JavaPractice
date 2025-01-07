package Varargs;

public class Var_args3 {
    static double discount(double... P)
    {
        double s = 0;
        for(int i=0;i<P.length;i++)
        {
            s = s+P[i];
        }
        double d = 0;
        if(s>500)
        {
            d = (s*10)/100;
        }
        else if (s>500 && s<1000)
        {
            d = (s*15)/100;
        }
        else if(s>1000)
        {
            d = (s*20)/100;
        }
    return d;           
    }
    public static void main(String args[])
    {
        System.out.println("The amount of discount is: "+discount());
        System.out.println("The amount of discount is: "+discount(234.44,100.34,20));
        System.out.println("The amount of discount is: "+discount(500,200.25,456,645.53));
        System.out.println("The amount of discount is: "+discount(10,20,30));
    }
}
