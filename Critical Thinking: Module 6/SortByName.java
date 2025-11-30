// Kyle Fahey
// CSC372-1
// Critical Thinking: Module 6

// Sorting an Array List

import java.util.Comparator;

// This Class Sorts the Students Alphabetically
public class SortByName implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2) {
        // Ignores cases when comparing
		return s1.name.compareToIgnoreCase(s2.name);
	}

}