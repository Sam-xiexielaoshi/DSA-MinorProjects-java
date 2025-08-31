package recursion;

public class binarySearchinRecursion {
    public static void main(String[] args) {
        int []arr = {1,2,3,45,66,73,87};
        int t = 66;
        System.out.println(search(arr, t, 0, arr.length-1));
    }
    static int search(int []arr, int t, int s,int e){
        if(s>e)return -1;
        int m = s+(e-s)/2;
        if(arr[m]==t)return m;
        if(t<arr[m]) return search(arr,t,s,m-1);
        return search(arr,t,m+1,e);
    }
}
