package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        bubbleSrot(arr);
        System.out.println(Arrays.toString(arr));
    }

    // with the 1st pass through the array, that largest element will be at the end
    // of the array
    // with the 2nd pass through the array, that 2nd largest element will be at the
    // 2nd last position of the array
    // inplace sorting algorithm
    // space complexity O(1)
    // time complexity O(n^2) worst case , O(n) best case
    // as the size of array is growing the time taken to sort the array is
    // increasing quadratically
    static void bubbleSrot(int[] arr) {
        boolean swapped;
        // run the setp n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not spwa for a particualr value of i, it means the array is sorted
            // hence stop the program
            if (!swapped)
                break;
        }
    }
}
