import java.util.Arrays;

public class Searchin2dArr {
    public static void main(String[] args) {
        int[][] arr={
            {24,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target=99;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[]ints:arr){
            for(int el:ints){
                if(el>max) max=el;
            }
        }
        return max;
    }
}

