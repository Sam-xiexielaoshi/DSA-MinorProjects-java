package recursion;

public class LegnthOfString {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(stringlen(str));
    }
    static int stringlen(String str){
        if(str.equals("")) return 0;
        else return stringlen(str.substring(1))+1;
    }
}
