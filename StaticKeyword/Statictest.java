package StaticKeyword;

class Test
{
    static int x = 10;
    int y = 20;
    public void show()
    {
        System.out.println(x);
        System.out.println(y);
    }
    static public void display()
    {
        System.out.println(x);
    }
}
public class Statictest {
    public static void main(String args[])
    {
        Test t1 =  new Test();
        t1.show();
        Test.display();
    }
}
