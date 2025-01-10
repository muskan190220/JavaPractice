package Constructors;

public class Customer {
    
    private long custid;
    private String name;
    private String addr;
    private long phno;

    public long getCustid()
    {
        return custid;
    }
    public String getName()
    {
        return name;
    }
    public String getAddr()
    {
        return addr;
    }
    public long getPhno()
    {
        return phno;
    }
    public void setPhno(long p)
    {
        phno = p;
    }
    
    public Customer(long c, String n, String a, long phno)
    {
        custid = c;
        name = n;
        addr = a;
        setPhno(phno);
    }
    
}
