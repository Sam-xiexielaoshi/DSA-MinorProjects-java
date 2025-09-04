package Maths;

public class pow {
    public static void main(String[] args) {
        int b = 3;
        int pow = 6;
        int ans = 1;
        while (pow>0){
            if((pow&1)==1) ans*=b;
            b*=b;
            pow = pow>>1;
        }           
        System.out.println(ans);
    }
}
