// Kyle Fahey
// CSC372-1
// Critical Thinking: Module 6

// Sorting an Array List

import java.util.ArrayList;

// Main Class that Sorts 10 Students by Name and Roll Number
public class Main {

	public static void main(String[] args) {
	
		// Array list that Holds 10 Student Objects
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(3, "Haiden Deegan", "Temecula CA"));
		students.add(new Student(1, "Eli Tomac", "Cortez CO"));
		students.add(new Student(2, "Cooper Webb", "Charlotte NC"));
		students.add(new Student(8, "Malcom Stewart", "Dade City FL"));
		students.add(new Student(6, "Austin Forkner", "Cleveland OH"));
		students.add(new Student(5, "Ryan Dungey", "Des Moines IA"));
		students.add(new Student(7, "James Stewart", "Dade City FL"));
		students.add(new Student(4, "Levi Kitchen", "Washougal WA"));
		students.add(new Student(9, "Adam Ciancarulio", "Orlando FL"));
		students.add(new Student(10, "Justin Brayton", "Des Moines IA"));
		
		// Prints the List of Students before Sorting
		System.out.println("Students before Sorting:");
		for (Student s : students) {
			System.out.println(s);
		}
		
		
		// Sorting by Name
		SelectionSort.selectionSort(students, new SortByName());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }
        
        
        // Sorting by Roll Number
        SelectionSort.selectionSort(students, new SortByRollNo());
        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }
		
	}

}