package Maths;

public class ithbitone {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        System.out.println(findIthBit(n,i));
    }
    static int findIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
}
