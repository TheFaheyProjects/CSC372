// Kyle Fahey
// CSC372-1
// Critical Thinking: Module 4

public class Cone extends Shape {
    private double radius;
    private double height;
    
    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    // Calculating the Surface Area
    @Override
    public double surface_area() {
        double slantHeight = Math.sqrt(height * height + radius * radius);
        return Math.PI * radius * (radius + slantHeight);
    }
    
    // Calculating the Volume
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
    
    // Prints the Surface Area and Volume
    @Override
    public String toString() {
        return String.format("Cone - Surface Area: %.2f, Volume: %.2f", 
                           surface_area(), volume());
    }
}