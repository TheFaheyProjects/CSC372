// Kyle Fahey
// CSC372-1
// Critical Thinking: Module 4

public class ShapeArray {
    public static void main(String[] args) {
        // Sphere
        Sphere sphere = new Sphere(5.0);
        
        // Cylinder
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        
        // Cone
        Cone cone = new Cone(4.0, 6.0);
        
        // Storing the Shapes into an Array named shapeArray
        Shape[] shapeArray = {sphere, cylinder, cone};
        
        // Loop through the Array and print out the Data of each Shape
        System.out.println("Shape Data:");
        System.out.println("-----------------");
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}