package Overriding;

class Super{
    public void display()
    {
        System.out.println("Hello");
    }

}
class Sub extends Super{
    public void display()
    {
        System.out.println("Hello Welcome");
    }
}
public class subsuper
{
    public static void main(String args[])
    {
        /*Super su = new Super();
        su.display();

        Sub sb = new Sub();
        sb.display();*/

        Super su= new Sub();
        su.display();

    }
}
