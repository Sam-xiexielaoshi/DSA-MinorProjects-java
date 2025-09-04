package Maths;

public class ithbittwo {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        System.out.println(setIthBit(n,i));
    }
    static int setIthBit(int n, int i){
        int bitmask = i<<i;
        return n |bitmask;
    }
}
