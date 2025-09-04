package Maths;

public class numberOfSetBits {
    public static void main(String[] args) {
        int n=13;
        int count =0;
        while (n>0){
            n=n&(n-1);
            count++;
        } 
        System.out.println(count);
    }
    //xor for till a 
    static int xor(int a){
        if(a%4==0) return a;
        if(a%4==1) return 1;
        if(a%4==2) return a+1;
        return 0;
    }
    //xor for range a to b
    static int rangeXor(int a, int b){
        return xor(b)^xor(a-1);
    }
}
