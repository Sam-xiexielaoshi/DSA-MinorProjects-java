package Sorting;

import java.util.Arrays;

public class CocktailShaker {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2, 7, 1, 6 };
        System.out.println("Original: " + Arrays.toString(arr));

        cocktailShakerSort(arr);
        System.out.println("Cocktail Shaker Sorted: " + Arrays.toString(arr));
    }

    static void cocktailShakerSort(int[] arr) {

        int left = 0;
        int right = arr.length - 1;
        boolean swapped = true;
        while (left < right && swapped) {
            swapped = false;
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tem = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tem;
                    swapped = true;
                }
            }
            right--;

            for (int j = right; j > left; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tem = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tem;
                    swapped = true;
                }
            }
            left++;
        }
    }
}
