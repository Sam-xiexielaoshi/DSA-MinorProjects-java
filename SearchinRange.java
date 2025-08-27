public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 3;
        System.out.println(ls(arr, target, 1, 2)); 
    }
    static int ls(int[] arr, int target, int start, int end){
        if(arr.length==0) return -1;
        for(int i = start;i<=end;i++){
            int el = arr[i];
            if(el==target) return i;
        }
        return -1;
    }
}
