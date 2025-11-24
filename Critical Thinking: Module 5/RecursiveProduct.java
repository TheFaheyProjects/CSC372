// Kyle Fahey
// CSC372-1
// Critical Thinking: Module 5

// Implementing Recursion to Provide a Product

import java.util.Scanner;
public class RecursiveProduct {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter Five Numbers to Calculate their Product:");

        // Collecting 5 Numbers from the User
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Calling the Recursive Method
        int product = calculateProduct(numbers, 0);

        // Displaying the Result
        System.out.println("\nThe Product of the Five Numbers Is: " + product);

        input.close();
    }

    // Recursive Method to Calculate Product
    public static int calculateProduct(int[] numbers, int index) {
        // Base Case
        if (index == numbers.length) {
            return 1;
        }

        // Recursive Case:
        return numbers[index] * calculateProduct(numbers, index + 1);
    }
}





