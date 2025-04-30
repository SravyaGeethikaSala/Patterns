package array;

import java.util.Random;
import java.util.Scanner;

/**
 * A program that initializes two integer arrays with random values,
 * prompts the user to input a sum, and finds pairs of numbers from both arrays
 * that add up to the given sum.
 * 
 * @author: Sravya Geethika Sala
 * SID: S574309
 */

public class Array {

    public static void main(String[] args) {
        // Declare arrays
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        // Fill arr1 with unique random values between 25-50
        fillUniqueRandomValues(arr1, 25, 50);
        
        // Fill arr2 with random values between 25-35
        fillRandomValues(arr2, 25, 35);
        
        // Display arrays
        System.out.print("Array 1: ");
        printArray(arr1);
        System.out.print("Array 2: ");
        printArray(arr2);
        
        // Take the sum input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sum: ");
        int sum = scanner.nextInt();
        
        // Find and display pairs with the given sum
        findPairsWithSum(arr1, arr2, sum);
        
        scanner.close();
    }
    
    /**
     * Fills an array with unique random values within a specified range.
     * 
     * @param array The array to be filled with unique values.
     * @param min   The minimum value (inclusive).
     * @param max   The maximum value (inclusive).
     */
    private static void fillUniqueRandomValues(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomValue;
            boolean isUnique;
            do {
                randomValue = random.nextInt(max - min + 1) + min;
                isUnique = true;
                for (int j = 0; j < i; j++) {
                    if (array[j] == randomValue) {
                        isUnique = false;
                        break;
                    }
                }
            } while (!isUnique);
            array[i] = randomValue;
        }
    }

    /**
     * Fills an array with random values within a specified range.
     * 
     * @param array The array to be filled.
     * @param min   The minimum value (inclusive).
     * @param max   The maximum value (inclusive).
     */
    private static void fillRandomValues(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }
    
    /**
     * Finds and displays pairs of numbers from two arrays that add up to a given sum.
     * 
     * @param arr1 The first array.
     * @param arr2 The second array.
     * @param sum  The target sum.
     */
    private static void findPairsWithSum(int[] arr1, int[] arr2, int sum) {
        boolean foundPair = false;
        int pairCount = 0;
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 + num2 == sum) {
                    foundPair = true;
                    System.out.println("Pair " + (++pairCount) + ": (" + num1 + "," + num2 + ")");
                }
            }
        }
        if (!foundPair) {
            System.out.println("No pair found");
        }
    }
    
    /**
     * Prints the elements of an array.
     * 
     * @param array The array to be printed.
     */
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
