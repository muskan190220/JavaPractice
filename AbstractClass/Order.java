package AbstractClass;

abstract class KFC
{
    KFC()
    {
        System.out.println("Pre-defined Standards of KFC");
    }
    public void makeitem()
    {
        System.out.println("Special recipe for KFC");
    }
    abstract void billing();
    abstract void offers();
}

class MyKFC extends KFC
{
    MyKFC()
    {
        System.out.println("Welcome to MY KFC");
    }
    public void billing()
    {
        System.out.println("Billing - MyKFC");
    }
    public void offers()
    {
        System.out.println("Offers - MyKFC");
    }
}
public class Order {
    public static void main(String args[])
    {
        KFC k = new MyKFC();
        k.makeitem();
        k.offers();
        k.billing();
    }
    
}
