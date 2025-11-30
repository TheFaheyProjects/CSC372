// Kyle Fahey
// CSC372-1
// Critical Thinking: Module 6

// Sorting an Array List

// Defining Student Object
public class Student {

    // Students Roll Number Stored as an Integer
	int rollno;		
    // Students Name as a String	
	String name;		
    // Students Address as a String - Using City and State
	String address;
	
	
	// Constructor for Initializing a Student
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	
	// toString() to Print the Students Information
	@Override
	public String toString() {
		return rollno + " - " + name + " - " + address;
	}
	
}