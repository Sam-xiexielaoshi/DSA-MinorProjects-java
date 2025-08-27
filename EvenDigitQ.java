public class EvenDigitQ {
    public static void main(String[] args) {
        int[]nums= {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num))
                count++;
        }
        return count;
    }

    static boolean even(int num) {
        int digits = digits(num);
        return (digits % 2 == 0) ? true : false;
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
