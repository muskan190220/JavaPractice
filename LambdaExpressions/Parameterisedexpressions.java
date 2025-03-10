package LambdaExpressions;

@FunctionalInterface
interface MyLambda2
{
    int add(int a, int b);
}

public class Parameterisedexpressions
{
    public static void main(String args[])
    {
        MyLambda2 m = (a,b) -> a+b;
        System.out.println(m.add(10,20));
        
    }
    
}


