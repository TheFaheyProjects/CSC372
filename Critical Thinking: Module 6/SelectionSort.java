// Kyle Fahey
// CSC372-1
// Critical Thinking: Module 6

// Sorting an Array List

import java.util.ArrayList;
import java.util.Comparator;

// Selection Sort Algorithm Class
// Works with Comparator for Sorting
public class SelectionSort {

	// Selection Sort Method for Array List of Students
	public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
		int n = list.size();

		
		// Loop for Each Element
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			
			
			// Inner Loop to Find the Smallest Element
			for (int j = i + 1; j < n; j++) {
				if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    // Updates Minimum if Smaller Element is Found
					minIndex = j;
				}
			}
		
			// Swap Element with Unsorted Element
			Student temp = list.get(i);
			list.set(i, list.get(minIndex));
			list.set(minIndex, temp);
		
		}	
	}	

}