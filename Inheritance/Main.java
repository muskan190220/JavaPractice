package Inheritance;

public class Main {
    public static void main(String[] args) {
        // Create a Circle instance
        Circle c1 = new Circle(7.5);
        System.out.println("Circle Area: " + c1.area());
        System.out.println("Circle Perimeter: " + c1.perimeter());

        // Create a Cylinder instance
        Cylinder c2 = new Cylinder(7.5, 10.5);
        System.out.println("Cylinder Volume: " + c2.volume());
    }
}

