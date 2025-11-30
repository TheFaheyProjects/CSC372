// Kyle Fahey
// CSC372-1
// Critical Thinking: Module 6

// Sorting an Array List

import java.util.Comparator;

// This Class Sorts Students by Roll Number
public class SortByRollNo implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2) {
        // Comparing RollNo through Integers
		return Integer.compare(s1.rollno, s2.rollno);
	}

}