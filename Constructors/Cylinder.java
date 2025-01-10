package Constructors;

public class Cylinder {
    private float radius;
    private float height;

    public float getRadius()
    {
        return radius;
    }
    public void setRadius(float r)
    {
        if(r<0)
        {
            radius = 0;
        }
        else
        {
            radius = r;
        }
    }
    public float getHeight()
    {
        return radius;
    }
    public void setHeight(float h)
    {
        if(h<0)
        {
            height = 0;
        }
        else
        {
            height = h;
        }
    }

    public Cylinder()
    {
        radius = 1;
        height = 1;
    }

    public Cylinder(float radius, float height)
    {
        setRadius(radius);
        setHeight(height);
    }


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
}
