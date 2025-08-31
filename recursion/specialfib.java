package recursion;

public class specialfib {
    public static void main(String[] args) {
        int a = 5, b = 7, n = 4;
        System.out.println(sf(a, b, n));
        System.out.println(csf(a, b, n));
    }
    static int sf(int a,int b ,int n){
        if(n==0)return a;
        if(n==1)return b;
        return sf(a, b, n-1)^sf(a, b, n-2);
    }
    static int csf(int a, int b, int n ){
        if(n%3==0) return a;
        if(n%3==1) return b;
        return a^b;
    }
}
