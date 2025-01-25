package AbstractClass;

abstract class Super
{
    Super()
    {
        System.out.println("Super class constructor");
    }
    public void meth1()
    {
        System.out.println("Meth1 of super class");
    }
    abstract void meth2();
}

class Sub extends Super
{
    public void meth2()
    {
        System.out.println("Meth2 of Sub class");
    }
    public void meth3()
    {
        System.out.println("Meth3 of sub");
    }
}

public class Methods 
{
    public static void main(String args[])
    {
        Sub s = new Sub();
        s.meth1();
        s.meth2();
        s.meth3();
    }
}
