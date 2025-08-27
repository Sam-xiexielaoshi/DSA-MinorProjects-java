public class Ceilofnum {

    // ceiling = smallest element in array greater or equal to target
    // floor = largest element in array less than or equal to target
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 1;
        System.out.println(ceil(arr, target));
        System.out.println(floor(arr, target));
    }

    static int ceil(int[] arr, int target) {
        if (target > arr[arr.length - 1])
            return -1;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }

    static int floor(int[] arr, int target) {
        // if(target>arr[arr.length-1])return -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return end;
    }

}

// log(nlog(n)) time complexity
// O(1) space complexity