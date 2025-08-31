package recursion;

public class MinMaxElement {
    public static void main(String[] args) {
        int[]arr = {-5,-3,0,2,3,76,-7};
        int[]res = MinMax(arr);
        System.out.println(res[0]+" "+res[1]);
    }
    static int getMin(int[]arr, int n){
        if(n==1) return arr[0];
        int min = getMin(arr, n-1);
        if(arr[n-1]<min) return arr[n-1];
        else return min;
    }
    static int getMax(int[]arr, int n){
        if(n==1) return arr[0];
        int max = getMax(arr,n-1);
        if(arr[n-1]>max) return arr[n-1];
        else return max;
    }
    static int[] MinMax(int[]arr){
        int maximum = getMax(arr, arr.length);
        int minimum = getMin(arr, arr.length);
        return new int[] {maximum, minimum};
    }
}
