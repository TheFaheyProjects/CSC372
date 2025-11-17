// Kyle Fahey
// CSC372-1
// Critical Thinking: Module 4

public class Sphere extends Shape {
    private double radius;
    
    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    // Calculating the Surface Area
    @Override
    public double surface_area() {
        return 4 * Math.PI * radius * radius;
    }
    
    // Calculating the Volume
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
    
    // Prints the Surface Area and Volume
    @Override
    public String toString() {
        return String.format("Sphere - Surface Area: %.2f, Volume: %.2f", 
                           surface_area(), volume());
    }
}