package SingletonClass;

class CoffeeMachine
{
    private float coffeeqty;
    private float waterqty;

    static private CoffeeMachine my = null;

    private CoffeeMachine()
    {
        coffeeqty = 1;
        waterqty = 1;
    }

    static public CoffeeMachine getInstance()
    {
        if(my  == null)
        {
            my = new CoffeeMachine();
        }
        return my;
    }
}
public class CoffeeStore
{
    public static void main(String args[])
    {
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);



        
    }
}

