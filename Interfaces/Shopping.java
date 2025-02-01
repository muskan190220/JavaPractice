package Interfaces;

class Store
{
    Member mem[] = new Member[100];
    int count =0;

    void register(Member m)
    {
        mem[count++] = m;
    }
    void invitesale()
    {
        for(int i=0; i<count; i++)
        {
            mem[i].callback();
        }
    }

}
interface Member
{
    void callback();
}

class Customer implements Member
{
    String name;
    Customer(String n)
    {
        name = n;
    }
    public void callback()
    {
        System.out.println("Yes I will visit, "+name);
    }
    
}
public class Shopping 
{
    public static void main(String args[])
    {
        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");

        s.register(c1);
        s.register(c2);
        s.invitesale();
    }
}
