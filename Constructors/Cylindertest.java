package Constructors;

public class Cylindertest {
    public static void main(String args[])
    {
        Cylinder c = new Cylinder(5, 15);
        System.out.println(c.lidarea());
        System.out.println(c.volume());
        System.out.println(c.TotSurfaceArea());
    }    
}
