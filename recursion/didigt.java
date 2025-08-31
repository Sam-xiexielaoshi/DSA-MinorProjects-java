package recursion;

public class didigt {
    public static void main(String[] args) {
        int base = 19;
        int exponent = 100;
        int res = Mod(base, exponent, exponent);
        if (res == 0)
            res = 9;
        System.out.println(res);
    }

    static int Mod(int base, int exponent, int mod) {
        long res = 1;
        long b = base % mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1)
                res = (res * b) % mod;
            b = b * b % mod;
            exponent >>= 1;
        }
        return (int) res;
    }
}
