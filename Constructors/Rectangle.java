package Constructors;

public class Rectangle {
    private int length;
    private int breadth;

    //get methods
    public int getLength()
    {
        return length;
    }
    public int getbreadth()
    {
        return breadth;
    }
    //set methods
    public void setLength(int l)
    {
        if(l<0)
        {
            length = 0;
        }
        else
        {
            length = l;
        }
    }
    public void setBreadth(int b)
    {
        if(b<0)
        {
            breadth = 0;
        }
        else
        {
            breadth = b;;
        }
    }
    //constructors
    public Rectangle()
    {
        length = 1;
        breadth = 1;
    }
    public Rectangle(int l, int b)
    {
        setLength(l);
        setBreadth(b);
    }

    //methods for area and perimeter

    public int area()
    {
        return getLength()*getbreadth();
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if(length == breadth)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

