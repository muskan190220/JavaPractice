package Constructors;

public class Product 
{
    
    private String itemno;
    private String name;
    private float price;
    private int qty;

    public String getItemno()
    {
        return itemno;
    }
    public String getName()
    {
        return name;
    }
    public float getPrice()
    {
        return price;
    }
    public void setPrice(float p)
    {
        if(p<0)
        {
            price = 0;
        }
        else
        {
            price = p;
        }
    }
    public int getQty()
    {
        return qty;
    }
    public void setQty(int q)
    {
        if(q<0)
        {
            qty = 0;
        }
        else
        {
            qty = q;
        }
    }

    public Product(String i)
    {
        itemno = i;
    }
    public Product(String i, String n)
    {
        itemno = i;
        name = n;
    }
    public Product(String i, String n, float price, int qty)
    {
        itemno = i;
        name = n;
        setPrice(price);
        setQty(qty);
    }

    public float Amount()
    {
        return price*qty; 
    }
}
