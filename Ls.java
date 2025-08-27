public class Ls {
    public static void main(String[] args) {
        int[] nums = {23,445,31,4,55,63,42,-8,-5,-2};
        int target = 2;
        int sum = ls(nums, target);
        System.out.println(sum);
    }

    static int ls(int[] arr, int target){
        if(arr.length==0) return -1;
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            if(ele == target) return i;
        }
        return -1;
    }

    static int ls2(int[] arr, int target){
        if(arr.length==0) return -1;
        for(int ele : arr){
            if(ele == target)return ele;
        }
        return -1;
    }
}
