package recursion;

public class tribonnaci {
    public static void main(String[] args) {
        int a=5, b=6,c=7, n=10;
        System.out.println(naci(a, b, c, n));
    }
    static long naci(long a, long b, long c, int n){
        if(n==1)return a;
        if(n==2)return b;
        if(n==3)return c;
        return naci(a, b, c, n-1)+naci(a, b, c, n-2)+naci(a, b, c, n-3);
    }
}
