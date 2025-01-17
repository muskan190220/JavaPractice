package Inheritance;

class Parent {
    public Parent()
    {
        System.out.println("Nonparam parent");
    }
    public Parent(int x)
    {
        System.out.println("Param Parent");
    }

}

class Child extends Parent{
    public Child()
    {
        System.out.println("Nonparam Child");
    }
    public Child(int y)
    {
        System.out.println("Param Child");
    }
}

class Grandchild extends Child
{
    public Grandchild()
    {
        System.out.println("Grandchild Constructor");
    }
    
}


