package leetcode;

public class minOperation1769 {
    public int[] minOperations(String boxes){
        int [] arr = new int[boxes.length()];
        for (int i=0;i<boxes.length();i++){
            for(int j=0;j<boxes.length();j++){
                if(boxes.charAt(j)=='1'&&i!=j){
                    arr[i]+=Math.abs(i-j);
                }

            }

        }
        return arr;
    }
    public static void main(String[] args) {
        minOperation1769 m = new minOperation1769();
        String boxes = "110";
        int [] arr = m.minOperations(boxes);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

