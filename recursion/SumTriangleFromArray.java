package recursion;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        tree(arr);
    }
    static void tree(int [] a){
        if(a.length<1)return ;
        int[]arr =new int[a.length-1];
        for(int i=0;i<a.length-1;i++){
            int rec = a[i]+a[i+1];
            arr[i] = rec;
        }
        tree(arr);
        System.out.println(Arrays.toString(a));
    }
}
