package Inheritance;

// Circle class
class Circle {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Methods for area and perimeter
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Cylinder class extends Circle
class Cylinder extends Circle {
    double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius); // Initialize the radius in the superclass
        this.height = height;
    }

    // Method for volume
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}


