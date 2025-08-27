public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);// yaha tak array ka max walue start me ajayega linear search se
            end += nums[i];
        }
        while (start < end) {
            // try for mid as potential ans
            int mid = start + (end - start) / 2;
            // calc max parts can be divide this in with tthis max sum
            int sum = 0;
            int parts = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // cannot add in this subarray, make new one
                    // new subarrays if made, then sum == num
                    sum = num;
                    parts++;
                } else
                    sum += num;
            }
            if (parts > k)
                start = mid + 1;
            else
                end = mid;
        }
        return end;// here start==end
    }
}
