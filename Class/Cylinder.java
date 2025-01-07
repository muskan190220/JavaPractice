package Class;
class Cylinder {
    public double radius;
    public double height;
    public double lidarea()
    {
        return 2*Math.PI*radius*radius;
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
    public double TotSurfaceArea()
    {
        return 2*Math.PI*radius*(height+radius);
    }

    public static void main(String args[])
    {
        Cylinder c = new Cylinder();
        c.radius = 3;
        c.height = 8;
        System.out.println(c.lidarea());
        System.out.println(c.volume());
        System.out.println(c.TotSurfaceArea());

    }
    
}
