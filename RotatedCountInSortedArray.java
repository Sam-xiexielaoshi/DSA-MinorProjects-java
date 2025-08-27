public class RotatedCountInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(CountRotations(arr));
    }

    private static int CountRotations(int[] arr) {
        int pivot = findPivot(arr);
        // int pivotDup = findPivotDup(arr);

        return pivot + 1;
    }

    // for non dups
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[mid] <= arr[start])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    // for dups
    static int findPivotDup(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1])
                    return start;
                start++;
                if (end > start && arr[end - 1] > arr[end])
                    return end - 1;
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
