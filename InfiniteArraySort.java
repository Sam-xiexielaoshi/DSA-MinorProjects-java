public class InfiniteArraySort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30 };
        int target = 15;
        System.out.println(ans(arr, target));
        ;
    }

    static int ans(int[] arr, int target) {
        int s = 0;
        int e = 1;
        while (e < arr.length && target > arr[e]) {
            int ns = e + 1;
            e = e + (e - s + 1) * 2;
            s = ns;
        }
        if (e >= arr.length) {
            e = arr.length - 1;
        }
        return BS(arr, target, s, e);

    }

    static int BS(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
