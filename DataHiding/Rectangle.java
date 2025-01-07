package DataHiding;
class Rectangle 
{
    private int length;
    private int breadth;
    //set length
    public int getLength()
    {
        return length;
    }
    public void setLength(int l)
    {
        if(l>0)
        {
            length = l;
        }
        else
        {
            length = 0;
        }
    }
    //set breadth
    public int getBreadth()
    {
        return breadth;
    }
    public void setBreadth(int b)
    {
        if(b>0)
        {
            breadth = b;
        }
        else
        {
            breadth = 0;
        }
    }

    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
     
}
