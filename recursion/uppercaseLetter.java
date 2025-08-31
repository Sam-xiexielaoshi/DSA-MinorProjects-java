package recursion;

public class uppercaseLetter {
    public static void main(String[] args) {
        String str = "aForApple";
        char res = upper(str);
        char ans = First(str,0);
        if(res==0||ans==0) System.out.println("nopw");
        System.out.println(res+" "+ans);
    }

    static char upper(String str){
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))return str.charAt(i);
        }return 0;
    }
    static char First(String str, int i){
        if(i>=str.length()) return 0;
        if(Character.isUpperCase(str.charAt(i))) return str.charAt(i);
        return First(str,i+1);
    }
}
