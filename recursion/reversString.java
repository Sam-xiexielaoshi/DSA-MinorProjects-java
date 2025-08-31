package recursion;

public class reversString {
    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        ReversString(str);
        System.out.println(str);
    }
    static void ReversString(char[]str){
        int s = 0;
        int e = str.length-1;
        while(s<e){
            char temp = str[s];
            str[s] = str[e];
            str[e]=temp;
            s++;e--;    
        }
    }
}
