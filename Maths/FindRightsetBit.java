package Maths;

public class FindRightsetBit {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(rightSetBit(n));
    }
    static int rightSetBit(int n){
        return n&~n;
    }
}
