package Strings;

public class Strings {
    public static void main(String[] args) {

        // String immutable
        String name = new String("Dsm");
        System.out.println("hello " + name);
        System.out.println(name.concat(" singh"));

        String n1 = "Dsm";
        // String n2 = "Dsm";
        if (n1 == name) {
            System.out.println("same");
        } else {
            System.out.println("not same");
            // mutalbe can be changes
            // immutable cannot be changed strings hamesha
        }

        // StringBuffer & StringBuilder
        StringBuffer sb = new StringBuffer("samagra");
        sb.append(" singh");
        System.out.println(sb);

        String str =sb.toString();
        System.out.println(str);

        sb.insert(0, "Java ");
        System.out.println(sb);
        sb.setLength(40);
    }
}
