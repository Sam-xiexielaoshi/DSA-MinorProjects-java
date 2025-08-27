package Sorting;

import java.util.Arrays;


public class CycleSortAlgo {

    // when given numbers from range 1 to n use cyclic sort
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] == arr[correct])
                i++;
            else {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
    }

}
