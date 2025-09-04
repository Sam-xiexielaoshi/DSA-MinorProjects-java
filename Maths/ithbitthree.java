package Maths;

public class ithbitthree {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        System.out.println(resetIthBit(n,i));
    }
    static int resetIthBit(int n ,int i){
        int bitmask = ~(1<<(i-1));
        return n & bitmask;
    }
 }
