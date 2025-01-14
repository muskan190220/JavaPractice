package Constructors;

public class Producttest {
    public static void main(String args[])
    {
        Product p = new Product("A123-45", "Tshirt", (float)75.2, 12);
        Customer c = new Customer(110023, "Muskan Kesharwani", "Itwari, Nagpur", 7498112598L);
        
        System.out.println("Customer details:");
        System.out.println(" ");
        
        System.out.println("Customer id.: "+c.getCustid());
        System.out.println("Name of the Customer: "+c.getName());
        System.out.println("Address of the Customer: "+c.getAddr());
        System.out.println("Phone no. of the Customer: "+c.getPhno());

        System.out.println(" ");

        System.out.println("Items bought by cutomer:");
        System.out.println(" ");

        System.out.println("Item no.: "+p.getItemno());
        System.out.println("Name of the Iteam: "+p.getName());
        System.out.println("Amount to be paid: "+p.Amount());

    }
}
