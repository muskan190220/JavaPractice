package MethodPractice;

public class MethodOverloading1 
{
    static int area(int l, int b)
    {
        int a = l*b;
        return a;
    }
    static float area(float r)
    {
        float c = (float) ((3.14)*r*r);
        return c;
    }
    static int area(int l)
    {
        int s = l*l;
        return s;
    }

    public static void main(String args[])
    {
        System.out.println(area(3));
    }
    
}
