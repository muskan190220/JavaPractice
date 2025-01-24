package Overriding;

class Car
{
    public void Start()
    {
        System.out.println("Car started");
    }
    public void Accelerate()
    {
        System.out.println("Accelerating the car");
    }
    public void ChangeGear()
    {
        System.out.println("Changing the gear Manually");
    }
}
class LuxuryCar extends Car
{
    public void Start()
    {
        System.out.println("Car started");
    }
    public void Accelerate()
    {
        System.out.println("Accelerating the car");
    }
    public void ChangeGear()
    {
        System.out.println("Changing the gear Automatically");
    }
    public void OpenRoof()
    {
        System.out.println("Sunroof getting opened");
    }
}

public class CarOverriding {
    public static void main(String args[])
    {
        Car c = new Car();
        c.Start();
        c.ChangeGear();
        c.Accelerate();

        LuxuryCar lc = new LuxuryCar();
        lc.Start();
        lc.Accelerate();
        lc.ChangeGear();
        lc.OpenRoof();

        Car cu = new LuxuryCar();
        cu.Accelerate();
}}