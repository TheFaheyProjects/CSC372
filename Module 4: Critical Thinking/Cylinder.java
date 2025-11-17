// Kyle Fahey
// CSC372-1
// Critical Thinking: Module 4

public class Cylinder extends Shape {
    private double radius;
    private double height;
    
    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    // Calculating the Surface Area
    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    // Calculating the Volume
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
    
    // Prints the Surface Area and Volume
    @Override
    public String toString() {
        return String.format("Cylinder - Surface Area: %.2f, Volume: %.2f", 
                           surface_area(), volume());
    }
}