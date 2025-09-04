package Maths;

public class findNum {
    public static void main(String[] args) {
        int[] arr = {3,3,2,3};
        System.out.println(findnum(arr));
    }
    //in an arr all the elements are occcuring 3 times ecept one find that number using modulur arithmetic
    static int findnum(int[] arr){
        int result = 0;
        for(int i=0;i<64;i++){
            int sum = 0;
            int bitmask = (1<<i);
            for(int num : arr){
                if((num & bitmask) != 0){
                    sum++;
                }
            }
            if(sum % 3 != 0){
                result |= bitmask;
            }
        }
        return result;
    }
}
